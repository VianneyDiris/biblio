package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.EditeurManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Editeur;
import org.core.app.model.bean.Ouvrage;
import org.core.app.model.exception.NotFoundException;

public class EditeurManagerImpl extends AbstractManagerImpl implements EditeurManager {

	@Override
	public List<Editeur> listEditeur() throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getEditeurDao().listEditeur();
	}

	@Override
	public Editeur find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getEditeurDao().find(id);
	}

	@Override
	public Editeur searchByOuvrage(Ouvrage ouvrage) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getEditeurDao().searchByOuvrage(ouvrage);
	}

	@Override
	public void addEditeur(Editeur editeur) {
		// TODO Auto-generated method stub
		getDaoFactory().getEditeurDao().addEditeur(editeur);
	}

	@Override
	public void updateEditeur(Editeur editeur) {
		// TODO Auto-generated method stub
		getDaoFactory().getEditeurDao().updateEditeur(editeur);
		
	}

	@Override
	public void deleteEditeur(Editeur editeur) {
		// TODO Auto-generated method stub
		getDaoFactory().getEditeurDao().deleteEditeur(editeur);
		
	}

}
