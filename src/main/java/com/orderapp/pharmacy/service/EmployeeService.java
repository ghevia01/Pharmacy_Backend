package com.orderapp.pharmacy.service;

import java.util.List;

import com.orderapp.pharmacy.data.model.Employee;

public interface EmployeeService {
    public Employee createEmployee(Employee customer);
    public List<Employee> getEmployees();
}
