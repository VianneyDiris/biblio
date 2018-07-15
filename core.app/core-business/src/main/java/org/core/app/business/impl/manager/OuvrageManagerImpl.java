package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.OuvrageManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.exception.NotFoundException;

public class OuvrageManagerImpl extends AbstractManagerImpl implements OuvrageManager {

	@Override
	public List<Ouvrage> listOuvrage() throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getOuvrageDao().listOuvrage();
	}

	@Override
	public Ouvrage find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getOuvrageDao().find(id);
	}

	@Override
	public void addOuvrage(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		getDaoFactory().getOuvrageDao().addOuvrage(ouvrage);
		
	}

	@Override
	public void updateOuvrage(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		getDaoFactory().getOuvrageDao().updateOuvrage(ouvrage);
		
	}

	@Override
	public void deleteOuvrage(Ouvrage ouvrage) {
		// TODO Auto-generated method stub
		getDaoFactory().getOuvrageDao().deleteOuvrage(ouvrage);
		
	}

}
