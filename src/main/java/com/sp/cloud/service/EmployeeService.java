package com.sp.cloud.service;

import com.sp.cloud.dao.EmployeeDAO;
import com.sp.cloud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }

    public void addEmployee(Employee e){
    employeeDAO.addEmployee(e);
    }
}
