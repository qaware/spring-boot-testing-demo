package de.qaware.demo.springboottestingdemo.controller;

import de.qaware.demo.springboottestingdemo.repository.BarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.stringContainsInOrder;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = BarController.class)
@TestPropertySource(properties = "bar.defaultResponse = bar bar bar yeah")
class BarControllerTest {

    @MockBean
    private BarRepository barRepository;

    @Autowired
    private MockMvc mvc;

    @Test
    void getBarItems() throws Exception {
        mvc.perform(get("/bar")).
                andExpect(status().isOk()).
                andExpect(content().string(stringContainsInOrder("bar bar bar yeah")));
        verify(barRepository).getBarItems();
    }
}