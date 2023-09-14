package com.orderapp.pharmacy.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.orderapp.pharmacy.data.model.Item;

public interface ItemRepo extends MongoRepository<Item,String>{
    
}
