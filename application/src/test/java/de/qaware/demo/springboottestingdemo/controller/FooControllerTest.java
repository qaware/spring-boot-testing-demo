package de.qaware.demo.springboottestingdemo.controller;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class FooControllerTest extends AbstractControllerTest {

    @Test
    void getFooItems() throws Exception {
        mvc.perform(get("/foo")).andExpect(status().isOk());
        verify(fooRepository).getFooItems();
    }
}