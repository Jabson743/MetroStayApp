package com.semicolon.africa.metrostayapp.data.repository;

import com.semicolon.africa.metrostayapp.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
