package de.qaware.demo.springboottestingdemo.controller;

import de.qaware.demo.springboottestingdemo.repository.BarRepository;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(BarControllerConfigurationProperties.class)
public class BarController {
    private final BarRepository barRepository;

    private final BarControllerConfigurationProperties barControllerConfigurationProperties;

    public BarController(BarRepository barRepository, BarControllerConfigurationProperties barControllerConfigurationProperties) {
        this.barRepository = barRepository;
        this.barControllerConfigurationProperties = barControllerConfigurationProperties;
    }

    @GetMapping("bar")
    String getBarItems() {
        return String.format("Hello %s, my items are: %s",
                barControllerConfigurationProperties.getDefaultResponse(),
                barRepository.getBarItems()
        );
    }

}
