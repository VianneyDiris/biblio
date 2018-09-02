package com.vianney.ws.ouvrageservice.operation;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "GetOuvrageIDRequest")
public class GetOuvrageIDRequest {
	
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
