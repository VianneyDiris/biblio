package com.vianney.ws.userservice.operation;

import org.core.app.model.bean.Utilisateur;

public class UserBeanConverter {
	
	public User utilisateurToUser(Utilisateur utilisateur) {
		User user= new User();
		user.setId(utilisateur.getId());
		user.setNom(utilisateur.getNom());
		user.setPrenom(utilisateur.getPrenom());
		user.setMail(utilisateur.getMail());
		user.setPassword(utilisateur.getPassword());
		
		return user;
	}
	
	public Utilisateur userToUtilisateur(User user) {
		Utilisateur utilisateur = new Utilisateur();
		
		utilisateur.setId(user.getId());
		utilisateur.setNom(user.getNom());
		utilisateur.setPrenom(user.getPrenom());
		utilisateur.setMail(user.getMail());
		utilisateur.setPassword(user.getPassword());
		
		return utilisateur;
		
	}

}
