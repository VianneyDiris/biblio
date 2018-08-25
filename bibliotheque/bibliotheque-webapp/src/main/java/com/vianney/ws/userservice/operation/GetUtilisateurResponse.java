package com.vianney.ws.userservice.operation;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "GetUtilisateurResponse")
public class GetUtilisateurResponse {
	
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
