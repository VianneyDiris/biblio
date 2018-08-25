package com.vianney.ws.userservice;

import org.core.app.business.contract.ManagerFactory;
import org.core.app.business.impl.ManagerFactoryImpl;
import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;

import com.vianney.ws.userservice.operation.AddUtilisateurRequest;
import com.vianney.ws.userservice.operation.AddUtilisateurResponse;
import com.vianney.ws.userservice.operation.GetUtilisateurRequest;
import com.vianney.ws.userservice.operation.GetUtilisateurResponse;
import com.vianney.ws.userservice.operation.UserBeanConverter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserServiceImpl implements UserService {
	static final Log logger = LogFactory.getLog(UserServiceImpl.class);
	private ManagerFactoryImpl managerFactory;
	private UserBeanConverter convert = new UserBeanConverter();
	
	public ManagerFactoryImpl getManagerFactory() {
		return managerFactory;
	}
	public void setManagerFactory(ManagerFactoryImpl managerFactory) {
		this.managerFactory = managerFactory;
	}



	@Override
	public AddUtilisateurResponse addUtilisateur(AddUtilisateurRequest addRequest) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = convert.userToUtilisateur(addRequest.getUser());
		
		managerFactory.getUtilisateurManager().addUtilisateur(utilisateur);

		AddUtilisateurResponse response = new AddUtilisateurResponse();
		response.setResult(true);
		return response;
	}
	@Override
	public GetUtilisateurResponse getUtilisateur(GetUtilisateurRequest getRequest) {
		// TODO Auto-generated method stub
		Utilisateur utilisateur = new Utilisateur();
		
		try {
			utilisateur = managerFactory.getUtilisateurManager().search(getRequest.getMail(), getRequest.getPassword());
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GetUtilisateurResponse response = new GetUtilisateurResponse();
		response.setUser(convert.utilisateurToUser(utilisateur));
		return response;
	}

}
