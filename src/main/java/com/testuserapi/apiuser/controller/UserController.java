package com.testuserapi.apiuser.controller;


import java.util.List;
import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testuserapi.apiuser.entity.User;
import com.testuserapi.apiuser.exception.CreateUserException;
import com.testuserapi.apiuser.exception.UserNotFoundException;
import com.testuserapi.apiuser.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api("API pour les opération CRUD sur le user")
@RestController
@RequestMapping("/api")
public class UserController {
	
	private final UserService userService;

	public UserController(UserService userService) {	
		this.userService = userService;
	}
	
	
	@PostMapping("/User")	
	public ResponseEntity<User> ajouterUser(@RequestBody User user)   {
	System.out.println("DEBUTER AJOUTER...");
		User userAdd ;
		
		if(!user.getCountry().toLowerCase().equals("france")) {
			System.out.println("EN CAS D\'ERREUR...");
			throw new CreateUserException("Le pays doit etre france");
		}else {
			System.out.println("TOUT SE PASSE BIEN...");
			userAdd = userService.creerCompte(user);
		}
		return ResponseEntity.ok(userAdd);
				
	}

	@ApiOperation(value="Donner les détails de l'user grâce à son nom")
	@GetMapping("/user/{nom}")
	public User getDetailUser(@PathVariable String nom) {
		if(Objects.isNull(userService.detailUsers(nom))) throw new  UserNotFoundException("User : "+nom+" n\' existe pas");
		return userService.detailUsers(nom);
	}
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		return userService.allUsers();
	}
	
}
