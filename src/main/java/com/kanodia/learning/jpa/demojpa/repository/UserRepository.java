package com.kanodia.learning.jpa.demojpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.kanodia.learning.jpa.demojpa.entity.User;

public interface UserRepository extends CrudRepository<User,Integer> {

}
