package com.shahaz.cruddemo.rest;

import com.shahaz.cruddemo.dao.EmployeeDao;
import com.shahaz.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeDao.findAll();
    }

}
