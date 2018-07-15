package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.LangueManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Langue;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.exception.NotFoundException;

public class LangueManagerImpl extends AbstractManagerImpl implements LangueManager {

	@Override
	public List<Langue> listLangue() throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getLangueDao().listLangue();
	}

	@Override
	public Langue find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getLangueDao().find(id);
	}

	@Override
	public Langue searchByOuvrage(Ouvrage ouvrage) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getLangueDao().searchByOuvrage(ouvrage);
	}

	@Override
	public void addLangue(Langue langue) {
		// TODO Auto-generated method stub
		getDaoFactory().getLangueDao().addLangue(langue);
		
	}

	@Override
	public void updateLangue(Langue langue) {
		// TODO Auto-generated method stub
		getDaoFactory().getLangueDao().updateLangue(langue);
		
	}

	@Override
	public void deleteLangue(Langue langue) {
		// TODO Auto-generated method stub
		getDaoFactory().getLangueDao().deleteLangue(langue);
		
	}

}
