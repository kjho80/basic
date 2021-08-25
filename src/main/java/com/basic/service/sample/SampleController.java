package com.basic.service.sample;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Api(tags = "samples")
@Slf4j
@RestController
@RequestMapping
@RequiredArgsConstructor
public class SampleController {
    private final SampleService sampleService;

    @GetMapping(value = "")
    @ApiOperation("Sample 조회")
    List<SampleDto> getSamples() {
        log.debug("sample 조회");
        return sampleService.getAll();
    }

    @PostMapping(value = "")
    @ApiOperation("Sample 생성")
    void createSample(@Valid @RequestBody SampleReqDto sampleDto) {
        log.debug("sample 생성");
        sampleService.create(sampleDto);
    }
}
