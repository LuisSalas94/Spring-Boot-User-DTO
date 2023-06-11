package com.userdemo.dto.service.implementation;

import com.userdemo.dto.dto.UserDto;
import com.userdemo.dto.entity.User;
import com.userdemo.dto.mapper.UserMapper;
import com.userdemo.dto.repository.UserRepository;
import com.userdemo.dto.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserImplementation implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public User createUser(User user) {
       return userRepository.save(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
        for(User user:userList) {
            // Custom Mapper
            //UserDto userDto = UserMapper.convertEntityToDto(user);

            // ModelMapper
            UserDto userDto = modelMapper.map(user, UserDto.class);
            userDtoList.add(userDto);
        }
        return userDtoList;
    }

    @Override
    public UserDto getUserById(Long userId) {
       Optional<User> optionalUser = userRepository.findById(userId);
       return UserMapper.convertEntityToDto(optionalUser.get());
    }
}
