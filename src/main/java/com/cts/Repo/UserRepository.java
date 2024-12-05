package com.cts.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

