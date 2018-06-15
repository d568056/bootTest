package com.sp.cloud.integration;

import com.sp.cloud.conf.ApplicationConfiguration;

import com.sp.cloud.model.Employee;
import com.sp.cloud.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.util.LinkedCaseInsensitiveMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = ApplicationConfiguration.class)
public class EmployeeInt {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void addEmployeeTest(){
        Employee e = new Employee();
        e.setId(105);
        e.setName("William");
        e.setAddress("John Carpentor road,London");
        employeeService.addEmployee(e);

       Assert.assertEquals("3",employeeCount(3));
    }

    private String employeeCount(Integer no){
        List objects = jdbcTemplate.queryForList("select count(*) as count from EMPLOYEE");
        Map<String,Object> map =  (LinkedCaseInsensitiveMap)objects.get(0);
       return  map.get("count").toString();
    }
}
