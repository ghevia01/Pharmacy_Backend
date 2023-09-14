package com.orderapp.pharmacy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.orderapp.pharmacy.data.model.Employee;
import com.orderapp.pharmacy.repository.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee createEmployee(Employee employee) {
        return this.employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return this.employeeRepo.findAll();
    }
    
}
