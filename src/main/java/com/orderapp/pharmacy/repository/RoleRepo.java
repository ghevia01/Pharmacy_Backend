package com.orderapp.pharmacy.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.orderapp.pharmacy.data.model.ERole;
import com.orderapp.pharmacy.data.model.Role;

public interface RoleRepo extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
