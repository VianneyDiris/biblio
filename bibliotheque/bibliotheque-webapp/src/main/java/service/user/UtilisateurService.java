package service.user;

import javax.jws.WebService;

import org.core.app.model.bean.Utilisateur;
import org.core.app.model.exception.NotFoundException;

@WebService
public interface UtilisateurService {
	
	void addUtilisateur(Utilisateur user);
	
	Utilisateur find(String mail, String password)throws NotFoundException;

}
