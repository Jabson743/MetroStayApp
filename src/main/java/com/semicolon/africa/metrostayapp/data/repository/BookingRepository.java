package com.semicolon.africa.metrostayapp.data.repository;

import com.semicolon.africa.metrostayapp.data.models.Booking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking, String> {
}
