package org.core.app.business.contract.manager;

import java.util.List;

import org.core.app.model.bean.Ouvrage;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;

public interface PretManager {
	
	List<Pret> listPret()throws NotFoundException;
	
	Pret find(Integer id)throws NotFoundException;
	
	List<Pret> searchPretByUtilisateur(Utilisateur user)throws NotFoundException;
	
	List<Pret> searchPretByOuvrage(Ouvrage ouvrage)throws NotFoundException;
	
	void addPret(Pret pret);
	
	void updatePret(Pret pret);
	
	void deletePret(Pret pret);

}
