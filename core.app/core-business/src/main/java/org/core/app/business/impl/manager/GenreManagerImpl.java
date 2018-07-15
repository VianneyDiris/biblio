package org.core.app.business.impl.manager;

import java.util.List;

import org.core.app.business.contract.manager.GenreManager;
import org.core.app.business.impl.AbstractManagerImpl;
import org.core.app.model.bean.Genre;
import org.core.app.model.exception.NotFoundException;

public class GenreManagerImpl extends AbstractManagerImpl implements GenreManager {

	@Override
	public List<Genre> listGenre() throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getGenreDao().listGenre();
	}

	@Override
	public Genre find(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getGenreDao().find(id);
	}

	@Override
	public List<Genre> searchGenreByOuvrageId(Integer id) throws NotFoundException {
		// TODO Auto-generated method stub
		return getDaoFactory().getGenreDao().searchGenreByOuvrageId(id);
	}

	@Override
	public void addGenre(Genre genre) {
		// TODO Auto-generated method stub
		getDaoFactory().getGenreDao().addGenre(genre);
		
	}

	@Override
	public void updateGenre(Genre genre) {
		// TODO Auto-generated method stub
		getDaoFactory().getGenreDao().updateGenre(genre);
		
	}

	@Override
	public void deleteGenre(Genre genre) {
		// TODO Auto-generated method stub
		getDaoFactory().getGenreDao().deleteGenre(genre);
		
	}

}
