package com.basic.service.sample;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotNull;

@Data
@Accessors(chain = true)
public class SampleReqDto {
    @NotNull
    private String name;
}
