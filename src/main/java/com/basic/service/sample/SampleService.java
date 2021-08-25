package com.basic.service.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class SampleService {
    private final SampleRepository sampleRepository;

    @Transactional(readOnly = true)
    public List<SampleDto> getAll() {
        return sampleRepository.findAll()
                .stream()
                .map(e -> new SampleDto().setId(e.getId()).setName(e.getName())).collect(Collectors.toList());
    }

    @Transactional
    public void create(SampleReqDto sampleReqDto) {
        Sample sample = new Sample().setName(sampleReqDto.getName());
        sampleRepository.save(sample);
    }
}
