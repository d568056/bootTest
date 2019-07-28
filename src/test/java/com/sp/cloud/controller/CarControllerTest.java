package com.sp.cloud.controller;

import com.sp.cloud.conf.ApplicationConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import  org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;



@RunWith(SpringRunner.class)
@WebMvcTest(CarController.class)
@ContextConfiguration(classes={ApplicationConfiguration.class})
public class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getCar_returnCarDetails() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders.get("/car/prius")).andExpect(status().isOk())
                .andExpect(jsonPath("name").value("prius"))
                .andExpect(jsonPath("type").value("hybrid"));

    }
}
