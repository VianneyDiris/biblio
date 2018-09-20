package com.vianney.ws.gestionrelance;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.core.app.model.bean.Pret;
@WebService(name ="GestionRelance")
public interface GestionRelance {
	
	@WebMethod
	public List<Pret> getListPretNonRendu();

}
