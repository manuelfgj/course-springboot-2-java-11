package com.manuelfgj.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manuelfgj.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
