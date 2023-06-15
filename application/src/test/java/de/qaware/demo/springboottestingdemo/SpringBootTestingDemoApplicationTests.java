package de.qaware.demo.springboottestingdemo;

import de.qaware.demo.springboottestingdemo.repository.BarRepository;
import de.qaware.demo.springboottestingdemo.repository.FooRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringBootTestingDemoApplicationTests {

	@MockBean
	private FooRepository fooRepository;

	@MockBean
	private BarRepository barRepository;

	@Test
	void contextLoads() {
		assertThat(fooRepository).isNotNull();
		assertThat(barRepository).isNotNull();
	}

}
