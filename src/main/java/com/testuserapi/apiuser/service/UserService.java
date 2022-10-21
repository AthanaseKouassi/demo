package com.testuserapi.apiuser.service;

import java.util.List;

import com.testuserapi.apiuser.entity.User;

public interface UserService {
	public User creerCompte(User user);
	
	public User detailUsers(String nom);
	
	public List<User> allUsers();

}
