package co.edu.ue.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.ue.model.Autores;

public class AutoresDao implements IAutores{
@Autowired
	IAutoresJpa jpa;
	
	@Override
	public List<Autores> addAutores(Autores autores) {
	
		jpa.save(autores);
		return getAllAutores();
	}

	@Override
	public Autores uppAutores(Autores autores) {
		
		return jpa.save(autores);
	}

	@Override
	public List<Autores> getAllAutores() {
		
		return jpa.findAll();
	}

	@Override
	public Autores getIdAutores(int id) {
		
		return jpa.findById(id).orElse(null);
	}

	@Override
	public boolean deleteAutores(int id) {
	    Optional<Autores> autorOptional = jpa.findById(id);
	    
	    if (autorOptional.isPresent()) {
	
	        jpa.delete(autorOptional.get());
	        return true;
	    }

	    return false;
	}


}
