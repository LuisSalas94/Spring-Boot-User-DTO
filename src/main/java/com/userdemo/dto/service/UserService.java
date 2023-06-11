package com.userdemo.dto.service;

import com.userdemo.dto.dto.UserDto;
import com.userdemo.dto.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    List<UserDto> getAllUsers();
    UserDto getUserById(Long userId);
}
