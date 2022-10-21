package com.testuserapi.apiuser.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testuserapi.apiuser.entity.User;
import com.testuserapi.apiuser.repository.UserRepository;
import com.testuserapi.apiuser.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User creerCompte(User user) {
		/*
		 * logger.info("Début ..."); User userAdd;
		 * if(user.getCountry().toLowerCase().equals("france")) {
		 * logger.info("Compte de "+user.getName()+" est CREE");
		 */
		//return 	userAdd = userRepository.save(user);
		return 	userRepository.save(user);
		/*}
		logger.info("Compte pas créé");
		return null;*/
	}

	@Override
	public User detailUsers(String nom) {
		logger.info("Utilisateur de nom : "+nom);
		if(nom.isBlank()) {
			return null;
		}		
		return userRepository.findByName(nom);
	}

	@Override
	public List<User> allUsers() {
		logger.info("Tous les utilisaters ...");
		return userRepository.findAll();
	}

}
