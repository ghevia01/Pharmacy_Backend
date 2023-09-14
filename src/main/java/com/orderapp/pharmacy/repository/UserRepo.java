package com.orderapp.pharmacy.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.orderapp.pharmacy.data.model.User;

public interface UserRepo extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
