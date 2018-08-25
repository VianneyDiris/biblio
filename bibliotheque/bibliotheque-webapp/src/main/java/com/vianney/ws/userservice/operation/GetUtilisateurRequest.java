package com.vianney.ws.userservice.operation;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "GetUtilisateurRequest")
public class GetUtilisateurRequest {
	
	private String mail;
	private String password;
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
