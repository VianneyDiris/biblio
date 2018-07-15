package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.UtilisateurManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Pret;
import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;

public class UtilisateurManagerImpl extends AbstractManagerImpl implements UtilisateurManager {

	@Override
	public List<Utilisateur> listUtilisateur() throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getUtilisateurDao().listUtilisateur();
	}

	@Override
	public Utilisateur find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getUtilisateurDao().find(id);
	}

	@Override
	public Utilisateur search(String mail, String password) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getUtilisateurDao().search(mail, password);
	}

	@Override
	public Utilisateur searchUserByPret(Pret pret) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getUtilisateurDao().searchUserByPret(pret);
	}

	@Override
	public void addUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		getDaoFactory().getUtilisateurDao().addUtilisateur(user);
	}

	@Override
	public void updateUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		getDaoFactory().getUtilisateurDao().updateUtilisateur(user);
		
	}

	@Override
	public void deleteUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		getDaoFactory().getUtilisateurDao().deleteUtilisateur(user);
		
	}

}
