package com.thomas.rest.webservices.restwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomas.rest.webservices.restwebservices.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
