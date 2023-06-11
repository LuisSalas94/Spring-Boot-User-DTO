package com.userdemo.dto.service.implementation;

import com.userdemo.dto.entity.User;
import com.userdemo.dto.repository.UserRepository;
import com.userdemo.dto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
