package com.example.demo.service;
import com.example.demo.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
public interface userService {

    Mono<User> findById(String id);
    Flux<User> findAll();
    Mono<User> save(User user);
    Mono<Void> deleteById(String id);
}
