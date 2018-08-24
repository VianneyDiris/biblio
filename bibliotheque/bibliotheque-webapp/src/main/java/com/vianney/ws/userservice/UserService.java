package com.vianney.ws.userservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.vianney.ws.userservice.operation.AddUtilisateurRequest;
import com.vianney.ws.userservice.operation.AddUtilisateurResponse;

@WebService(name ="UserService")
public interface UserService {
	
	@WebMethod
	public  @WebResult(name = "response") AddUtilisateurResponse response(@WebParam(name = "addUtilisateur")AddUtilisateurRequest request);

}
