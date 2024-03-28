package com.shahaz.cruddemo.service;

import com.shahaz.cruddemo.dao.EmployeeDao;
import com.shahaz.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao theEmployeeDao) {
        employeeDao = theEmployeeDao;
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employeeList = employeeDao.findAll();
        return employeeList;
    }

    @Override
    public Employee findById(int id) {
        Employee employee= employeeDao.findById(id);
        return employee;
    }
}
