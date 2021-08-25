package com.basic.service.sample;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SampleDto {
    private String id;
    private String name;
}
