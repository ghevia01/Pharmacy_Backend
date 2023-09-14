package com.orderapp.pharmacy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.orderapp.pharmacy.data.model.Employee;

public interface EmployeeRepo extends MongoRepository<Employee, String> {

}
