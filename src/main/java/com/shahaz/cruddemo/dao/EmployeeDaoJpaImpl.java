package com.shahaz.cruddemo.dao;

import com.shahaz.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDaoJpaImpl implements EmployeeDao {

    EntityManager entityManager;

    @Autowired
    public EmployeeDaoJpaImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        //create query
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM employee", Employee.class);

        //execute query and get result list
        List<Employee> employeeList =   theQuery.getResultList();

        //return list
        return  employeeList;
    }
}
