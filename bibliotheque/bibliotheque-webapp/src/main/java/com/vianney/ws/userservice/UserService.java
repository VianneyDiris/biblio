package com.vianney.ws.userservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.vianney.ws.userservice.operation.AddUtilisateurRequest;
import com.vianney.ws.userservice.operation.AddUtilisateurResponse;
import com.vianney.ws.userservice.operation.GetUtilisateurRequest;
import com.vianney.ws.userservice.operation.GetUtilisateurResponse;

@WebService(name ="UserService")
public interface UserService {
	
	@WebMethod
	public  @WebResult(name = "addUtilisateur") AddUtilisateurResponse addUtilisateur(@WebParam(name = "addRequest")AddUtilisateurRequest addRequest);
	
	@WebMethod
	public  @WebResult(name = "getUtilisateur") GetUtilisateurResponse getUtilisateur(@WebParam(name = "getRequest")GetUtilisateurRequest getRequest);

}
