package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.userService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
public class UserController {
    private userService userService;
    public UserController(userService userService) {
        this.userService = userService;
    }
    @GetMapping(value = "/user/{id}")
    public Mono<User> getUserById(@PathVariable String id) {
        return userService.findById(id);
    }
    @GetMapping(value = "/users")
    public Flux<User> getAllUsers() {
        return userService.findAll();
    }
    @PostMapping(value = "/user")
    public Mono<User> createUser(@RequestBody User user) {
        return userService.save(user);
    }
    @DeleteMapping(value = "/user/{id}")
    public String delUserById(@PathVariable String id) {
         userService.deleteById(id);
        return "delete success";
    }
}
