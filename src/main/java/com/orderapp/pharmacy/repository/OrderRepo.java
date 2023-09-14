package com.orderapp.pharmacy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.orderapp.pharmacy.data.model.Order;

public interface OrderRepo extends MongoRepository<Order, String> {

}
