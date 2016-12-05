package com.webdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webdemo.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
