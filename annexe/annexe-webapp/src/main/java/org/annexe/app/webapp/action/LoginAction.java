package org.annexe.app.webapp.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	
	// ==================== Attributs ====================
    // ----- Paramètres en entrée
    private String mail;
    private String password;
	
    // ==================== Getters/Setters ====================
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
	
	// ==================== Méthodes ====================
	public String execute(){
		return ActionSupport.SUCCESS;
	}
}
