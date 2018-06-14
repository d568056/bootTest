package com.sp.cloud.service;

import com.sp.cloud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EtlRunner implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void run(String... strings) throws Exception {
        System.out.print("Command Line runner *************************");
        employeeService.addEmployee(getEmployee());
    }

    private Employee getEmployee(){
        Employee e = new Employee();
        e.setId(100);
        e.setName("Nikhil");
        e.setAddress("Brabazon Street,London");
        return e;

    }
}
