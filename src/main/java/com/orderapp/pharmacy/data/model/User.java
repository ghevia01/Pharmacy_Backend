package com.orderapp.pharmacy.data.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document("user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
  
  @Id
  private String id;
  private String username;
  private String email;
  private String password;
  
  @DBRef
  private Set<Role> roles = new HashSet<>();

  public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
  }
}
