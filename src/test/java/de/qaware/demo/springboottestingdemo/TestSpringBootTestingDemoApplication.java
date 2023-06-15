package de.qaware.demo.springboottestingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringBootTestingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootTestingDemoApplication::main).with(TestSpringBootTestingDemoApplication.class).run(args);
	}

}
