package com.userdemo.dto.controller;
import com.userdemo.dto.entity.User;
import com.userdemo.dto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PutMapping
    // http://localhost:8080/api/users
    public ResponseEntity<User> createUser(@RequestBody User user) {
       User savedUser = userService.createUser(user);
       return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

}
