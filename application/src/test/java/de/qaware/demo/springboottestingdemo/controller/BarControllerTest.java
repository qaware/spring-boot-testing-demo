package de.qaware.demo.springboottestingdemo.controller;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.stringContainsInOrder;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class BarControllerTest extends AbstractControllerTest {

    @Test
    void getBarItems() throws Exception {
        mvc.perform(get("/bar")).
                andExpect(status().isOk()).
                andExpect(content().string(stringContainsInOrder("bar bar bar yeah")));
        verify(barRepository).getBarItems();
    }
}