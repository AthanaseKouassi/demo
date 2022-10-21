package com.testuserapi.apiuser.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity()
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private LocalDate birthdate;
	private String country;
	private String phone;

	public enum Genre {M,F}
	@Enumerated(value = EnumType.STRING)
	private Genre genre;
	
	// Constructeur par defaut
	public User() {
		
	}
	
	// constructeur avec propriété 
	public User(Long id, String name, LocalDate birthdate, String country, String phone, Genre genre) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.country = country;
		this.phone = phone;
		this.genre = genre;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthdate=" + birthdate + ", country=" + country + ", phone="
				+ phone + ", genre=" + genre + "]";
	}

}
