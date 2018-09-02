package com.vianney.ws.ouvrageservice.operation;

import javax.xml.bind.annotation.XmlType;

import org.core.app.model.bean.Ouvrage;

@XmlType(name = "GetOuvrageIDResponse")
public class GetOuvrageIDResponse {

	private Ouvrage ouvrage;

	public Ouvrage getOuvrage() {
		return ouvrage;
	}

	public void setOuvrage(Ouvrage ouvrage) {
		this.ouvrage = ouvrage;
	}
	
}
