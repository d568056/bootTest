package com.sp.cloud.dao.impl;

import com.sp.cloud.dao.EmployeeDAO;
import com.sp.cloud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {


    String sql = "INSERT INTO EMPLOYEE VALUES (?,?,?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public EmployeeDAOImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addEmployee(Employee e) {
    jdbcTemplate.update(sql, new PreparedStatementSetter() {
        @Override
        public void setValues(PreparedStatement preparedStatement) throws SQLException {
            preparedStatement.setInt(1,e.getId());
            preparedStatement.setString(2,e.getName());
            preparedStatement.setString(3,e.getAddress());

        }
    });
    System.out.print("Successfully  added employee");
    }
}
