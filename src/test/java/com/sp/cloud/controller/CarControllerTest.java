package com.sp.cloud.controller;

import com.sp.cloud.conf.ApplicationConfiguration;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.MockMvcBuilder.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.util.regex.Matcher;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;



@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(CarController.class)
@ContextConfiguration(classes={ApplicationConfiguration.class})
public class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getCar_returnCarDetails() throws Exception{

        mockMvc.perform(get("/car/prius"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("name").value("prius"))
                .andExpect(jsonPath("$.type").value("hybrid"))
                .andExpect(jsonPath("$.*",Matchers.hasSize(2)));

    }
}
