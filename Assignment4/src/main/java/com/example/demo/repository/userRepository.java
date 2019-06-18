package com.example.demo.repository;
import com.example.demo.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
public interface  userRepository extends ReactiveMongoRepository<User, String> {
}
