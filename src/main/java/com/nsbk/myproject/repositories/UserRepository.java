package com.nsbk.myproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nsbk.myproject.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
