package com.service;

import javax.jws.WebService;

import bean.Utilisateur;
import exception.NotFoundException;

@WebService(endpointInterface = "com.service.UserAccount",serviceName="userAccount")
public class UserAccountImpl implements UserAccount {

	public void addUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		
	}

	public Utilisateur search(String mail, String password) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
