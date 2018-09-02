package com.vianney.ws.ouvrageservice.operation;

import java.util.List;

import javax.xml.bind.annotation.XmlType;

import org.core.app.model.bean.Ouvrage;

@XmlType(name = "ListOuvrageResponse")
public class ListOuvrageResponse {
	
	private List<Ouvrage> listOuvrage;

	public List<Ouvrage> getListOuvrage() {
		return listOuvrage;
	}

	public void setListOuvrage(List<Ouvrage> listOuvrage) {
		this.listOuvrage = listOuvrage;
	}
	
	

}
