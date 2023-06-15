package de.qaware.demo.springboottestingdemo.controller;

import de.qaware.demo.springboottestingdemo.repository.FooRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = FooController.class)
class FooControllerTest {

    @MockBean
    private FooRepository fooRepository;

    @Autowired
    private MockMvc mvc;

    @Test
    void getFooItems() throws Exception {
        mvc.perform(get("/foo")).andExpect(status().isOk());
        verify(fooRepository).getFooItems();
    }
}