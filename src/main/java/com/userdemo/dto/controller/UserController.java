package com.userdemo.dto.controller;
import com.userdemo.dto.dto.UserDto;
import com.userdemo.dto.entity.User;
import com.userdemo.dto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    // http://localhost:8080/api/users
    public ResponseEntity<List<UserDto>> getAllUsers() {
          List<UserDto> userList = userService.getAllUsers();
          return  new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @GetMapping("{id}")
    // http://localhost:8080/api/users/1
    public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId) {
         UserDto savedUser = userService.getUserById(userId);
         return new ResponseEntity<>(savedUser, HttpStatus.OK);
    }

}
