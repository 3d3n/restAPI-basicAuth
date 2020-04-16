package com.example.restbasic.controller;

import com.example.restbasic.dao.EmployeeDAO;
import com.example.restbasic.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class EmployeeController {
    @Autowired
    private EmployeeDAO employeeDao;

    @GetMapping(path = "/employees")
    public Employees getEmployees() {
        return employeeDao.getAllEmployees();
    }
}
