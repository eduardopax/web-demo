package com.webdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webdemo.entity.Data;


public interface DataRepository extends JpaRepository<Data, Long> {

}
