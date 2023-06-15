package de.qaware.demo.springboottestingdemo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "bar")
public class BarControllerConfigurationProperties {
    private final String defaultResponse;

    public BarControllerConfigurationProperties(String defaultResponse) {
        this.defaultResponse = defaultResponse;
    }

    public String getDefaultResponse() {
        return defaultResponse;
    }
}
