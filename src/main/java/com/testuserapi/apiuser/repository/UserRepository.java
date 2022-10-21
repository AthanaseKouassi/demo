package com.testuserapi.apiuser.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testuserapi.apiuser.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByName(String name);

	List<User> findAll();
}
