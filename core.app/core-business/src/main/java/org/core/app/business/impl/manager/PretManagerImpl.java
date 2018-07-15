package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.PretManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;

public class PretManagerImpl extends AbstractManagerImpl implements PretManager {

	@Override
	public List<Pret> listPret() throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getPretDao().listPret();
	}

	@Override
	public Pret find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getPretDao().find(id);
	}

	@Override
	public List<Pret> searchPretByUtilisateur(Utilisateur user) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getPretDao().searchPretByUtilisateur(user);
	}

	@Override
	public List<Pret> searchPretByOuvrage(Ouvrage ouvrage) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getPretDao().searchPretByOuvrage(ouvrage);
	}

	@Override
	public void addPret(Pret pret) {
		// TODO Auto-generated method stub
		getDaoFactory().getPretDao().addPret(pret);
		
	}

	@Override
	public void updatePret(Pret pret) {
		// TODO Auto-generated method stub
		getDaoFactory().getPretDao().updatePret(pret);
		
	}

	@Override
	public void deletePret(Pret pret) {
		// TODO Auto-generated method stub
		getDaoFactory().getPretDao().deletePret(pret);
	}

}
