package com.example.springcloudawsgh101;

import javax.annotation.PostConstruct;
import javax.validation.ValidationException;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@ConfigurationProperties(prefix = "app")
class AppProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void validate() {
        if ("foo".equals(name)) {
            throw new FooException();
        }
    }
}
