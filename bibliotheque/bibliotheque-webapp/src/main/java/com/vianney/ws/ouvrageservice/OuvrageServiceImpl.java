package com.vianney.ws.ouvrageservice;

import org.core.app.business.impl.ManagerFactoryImpl;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.exception.NotFoundException;

import com.vianney.ws.ouvrageservice.operation.GetOuvrageIDRequest;
import com.vianney.ws.ouvrageservice.operation.GetOuvrageIDResponse;
import com.vianney.ws.ouvrageservice.operation.ListOuvrageResponse;

public class OuvrageServiceImpl implements OuvrageService {
	private ManagerFactoryImpl managerFactory;
	
	public ManagerFactoryImpl getManagerFactory() {
		return managerFactory;
	}
	public void setManagerFactory(ManagerFactoryImpl managerFactory) {
		this.managerFactory = managerFactory;
	}

	@Override
	public GetOuvrageIDResponse getOuvrageID(GetOuvrageIDRequest getRequest) {
		// TODO Auto-generated method stub
		Integer id = getRequest.getId();
		Ouvrage ouvrage = new Ouvrage();
		
		try {
			ouvrage = managerFactory.getOuvrageManager().find(id);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GetOuvrageIDResponse response = new GetOuvrageIDResponse();
		response.setOuvrage(ouvrage);
		
		return response;
	}
	@Override
	public ListOuvrageResponse getListOuvrage() {
		// TODO Auto-generated method stub
		ListOuvrageResponse response = new ListOuvrageResponse();
		
		try {
			response.setListOuvrage(managerFactory.getOuvrageManager().listOuvrage());
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
	}

}
