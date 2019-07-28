package com.sp.cloud.controller;

import com.sp.cloud.model.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/car/{name}")
    public Car getCar(@PathVariable String name){
    return new Car("prius","hybrid");
    }
}
