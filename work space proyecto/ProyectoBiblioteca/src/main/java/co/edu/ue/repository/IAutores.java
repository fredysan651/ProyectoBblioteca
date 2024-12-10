package co.edu.ue.repository;

import java.util.List;

import co.edu.ue.model.Autores;

public interface IAutores {
	
	List<Autores> addAutores(Autores autores );
	Autores uppAutores (Autores autores);
	
	List<Autores> getAllAutores();
	Autores getIdAutores(int id);
	
	boolean deleteAutores(int id);

}
