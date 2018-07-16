package org.core.app.consumer.impl.dao;

import java.util.List;

import org.core.app.consumer.contract.GenreDao;
import org.core.app.consumer.impl.AbstractDaoImpl;
import org.core.app.consumer.impl.rowmapper.GenreRM;
import org.core.app.model.bean.Genre;
import org.springframework.jdbc.core.JdbcTemplate;

public class GenreDaoImpl extends AbstractDaoImpl implements GenreDao {

	@Override
	public List<Genre> listGenre() {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.genre";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		GenreRM rowGenre = new GenreRM();
		
		List<Genre> listGenre = vJdbcTemplate.query(vsql, rowGenre);
		
		return listGenre;
	}

	@Override
	public Genre find(Integer id) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.genre WHERE id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		GenreRM rowGenre = new GenreRM();
		
		Genre genre = (Genre)vJdbcTemplate.queryForObject(vsql, new Object[] { id }, rowGenre);
		
		return genre;
	}

	@Override
	public List<Genre> searchGenreByOuvrageId(Integer id) {
		// TODO Auto-generated method stub
		String vsql="SELECT * FROM public.genre INNER JOIN public.ouvrage_genre ON genre.id=ouvrage_genre.genre_id WHERE ouvrage_genre.ouvrage_id=?";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		GenreRM rowGenre = new GenreRM();
		
		List<Genre> listGenre = vJdbcTemplate.query(vsql, rowGenre);
		
		return listGenre;
	}

	@Override
	public void addGenre(Genre genre) {
		// TODO Auto-generated method stub
		String vsql = "INSERT INTO public.genre (genre) VALUES (?)";
		
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,genre.getGenre());		
	}

	@Override
	public void updateGenre(Genre genre) {
		// TODO Auto-generated method stub
		String vSQL = "UPDATE public.genre SET genre =? WHERE id = ?";
		 
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vSQL,genre.getGenre(),genre.getId());
		
	}

	@Override
	public void deleteGenre(Genre genre) {
		// TODO Auto-generated method stub
		String vsql="DELETE FROM public.genre WHERE id=?";
		JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
		vJdbcTemplate.update(vsql,new Object[] { genre.getId() });
		
	}

}
