package com.example.demo.service;
import com.example.demo.model.User;
import com.example.demo.repository.userRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Service
public class UserServiceImpl  implements userService {
    private userRepository userRepository;

    public UserServiceImpl(userRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public Mono<User> findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public Flux<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Mono<User> save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return userRepository.deleteById(id);
    }
}
