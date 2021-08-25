package com.basic.service.config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@Profile({"default"})
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket swaggerApiDocs() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .build()
                .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false)
                .apiInfo(new ApiInfo("sample", null, null, null, null, null, null, Collections.emptyList()));
    }
}
