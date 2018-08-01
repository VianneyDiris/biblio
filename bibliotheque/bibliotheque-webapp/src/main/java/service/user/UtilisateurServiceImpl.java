package service.user;

import org.core.app.business.contract.ManagerFactory;
import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;

public class UtilisateurServiceImpl implements UtilisateurService {
	private ManagerFactory managerFactory;	

	@Override
	public void addUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		managerFactory.getUtilisateurManager().addUtilisateur(user);
		
	}

	@Override
	public Utilisateur find(String mail, String password) throws NotFoundException {
		// TODO Auto-generated method stub
		return managerFactory.getUtilisateurManager().search(mail, password);
	}

}
