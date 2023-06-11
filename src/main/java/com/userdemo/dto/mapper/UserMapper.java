package com.userdemo.dto.mapper;

import com.userdemo.dto.dto.UserDto;
import com.userdemo.dto.entity.User;

public class UserMapper {
    public static UserDto convertEntityToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }
}
