package com.userdemo.dto.repository;

import com.userdemo.dto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
