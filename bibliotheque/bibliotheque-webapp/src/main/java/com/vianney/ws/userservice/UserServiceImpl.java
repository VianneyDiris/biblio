package com.vianney.ws.userservice;

import org.core.app.business.contract.ManagerFactory;
import org.core.app.business.impl.ManagerFactoryImpl;
import org.core.app.model.bean.Utilisateur;

import com.vianney.ws.userservice.operation.AddUtilisateurRequest;
import com.vianney.ws.userservice.operation.AddUtilisateurResponse;
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
	public AddUtilisateurResponse response(AddUtilisateurRequest request) {
		// TODO Auto-generated method stub
		logger.info(convert);
		logger.info(managerFactory);
		logger.info(request.getUser().getNom());
		Utilisateur utilisateur = convert.userToUtilisateur(request.getUser());
		
		managerFactory.getUtilisateurManager().addUtilisateur(utilisateur);
		AddUtilisateurResponse response = new AddUtilisateurResponse();
		response.setResult(true);
		return response;
	}

}
