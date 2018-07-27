package com.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import bean.Utilisateur;
import exception.NotFoundException;

@WebService
public interface UserAccount {
	
	@WebMethod
	void addUtilisateur(Utilisateur user);
	
	@WebMethod
	Utilisateur search(String mail, String password) throws NotFoundException;

}
