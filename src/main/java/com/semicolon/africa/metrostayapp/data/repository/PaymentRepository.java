package com.semicolon.africa.metrostayapp.data.repository;

import com.semicolon.africa.metrostayapp.data.models.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
