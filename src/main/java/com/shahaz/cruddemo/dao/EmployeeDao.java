package com.shahaz.cruddemo.dao;

import com.shahaz.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> findAll();

}
