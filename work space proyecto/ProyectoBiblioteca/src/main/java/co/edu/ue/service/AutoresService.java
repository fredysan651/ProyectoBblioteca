package co.edu.ue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.model.Autores;
import co.edu.ue.repository.IAutores;

public class AutoresService implements IAutoresService {
	
	@Autowired
	IAutores dao;

	@Override
	public List<Autores> addAutores(Autores autores) {

		return dao.addAutores(autores);
	}

	@Override
	public Autores uppAutores(Autores autores) {
		// TODO Auto-generated method stub
		return dao.uppAutores(autores);
	}

	@Override
	public List<Autores> getAllAutores() {
		// TODO Auto-generated method stub
		return dao.getAllAutores();
	}

	@Override
	public Autores getIdAutores(int id) {
		// TODO Auto-generated method stub
		return dao.getIdAutores(id);
	}

	@Override
	public boolean deleteAutores(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
