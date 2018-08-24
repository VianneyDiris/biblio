package com.vianney.ws.userservice.operation;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AddUtilisateurResponse")
public class AddUtilisateurResponse {
	private boolean result;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	

}
