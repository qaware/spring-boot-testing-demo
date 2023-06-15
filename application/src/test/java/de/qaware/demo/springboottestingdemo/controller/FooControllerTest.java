package de.qaware.demo.springboottestingdemo.controller;

import de.qaware.demo.springboottestingdemo.repository.BarRepository;
import de.qaware.demo.springboottestingdemo.repository.FooRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class FooControllerTest {

    @MockBean
    private FooRepository fooRepository;

    @MockBean
    private BarRepository barRepository;

    @Autowired
    private MockMvc mvc;

    @Test
    void getFooItems() throws Exception {
        mvc.perform(get("/foo")).andExpect(status().isOk());
        verify(fooRepository).getFooItems();
    }
}