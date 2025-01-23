package com.semicolon.africa.metrostayapp.data.repository;

import com.semicolon.africa.metrostayapp.data.models.Property;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PropertyRepository extends MongoRepository<Property, String> {
}
