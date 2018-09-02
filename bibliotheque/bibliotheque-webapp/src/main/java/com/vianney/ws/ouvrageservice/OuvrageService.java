package com.vianney.ws.ouvrageservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.vianney.ws.ouvrageservice.operation.GetOuvrageIDRequest;
import com.vianney.ws.ouvrageservice.operation.GetOuvrageIDResponse;
import com.vianney.ws.ouvrageservice.operation.ListOuvrageResponse;

@WebService(name ="OuvrageService")
public interface OuvrageService {
	
	@WebMethod
	public  @WebResult(name = "getOuvrageID") GetOuvrageIDResponse getOuvrageID(@WebParam(name = "getRequest")GetOuvrageIDRequest getRequest);

	@WebMethod
	public  @WebResult(name = "getListOuvrage") ListOuvrageResponse getListOuvrage();
	
}
