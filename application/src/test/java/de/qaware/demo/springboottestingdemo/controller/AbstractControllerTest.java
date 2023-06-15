package de.qaware.demo.springboottestingdemo.controller;

import de.qaware.demo.springboottestingdemo.repository.BarRepository;
import de.qaware.demo.springboottestingdemo.repository.FooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

abstract class AbstractControllerTest {
    @Autowired
    protected MockMvc mvc;

    @MockBean
    protected FooRepository fooRepository;
    @MockBean
    protected BarRepository barRepository;

}
