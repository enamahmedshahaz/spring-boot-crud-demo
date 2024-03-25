package com.shahaz.cruddemo.dao;

import com.shahaz.cruddemo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao {
    @Override
    public List<Employee> findAll() {
        return null;
    }
}
