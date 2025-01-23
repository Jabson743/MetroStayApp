package com.semicolon.africa.metrostayapp.data.repository;

import com.semicolon.africa.metrostayapp.data.models.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {
}
