package com.userdemo.dto.service.implementation;

import com.userdemo.dto.entity.User;
import com.userdemo.dto.repository.UserRepository;
import com.userdemo.dto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
       return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
       Optional<User> optionalUser = userRepository.findById(userId);
       return optionalUser.get();
    }
}
