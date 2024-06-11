package com.thomas.rest.webservices.restwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomas.rest.webservices.restwebservices.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
