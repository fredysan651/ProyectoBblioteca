package co.edu.ue.repository;

import java.util.List;

import co.edu.ue.model.Persona;

public interface IPersona {
		List<Persona> addPersona (Persona persona);
		Persona uppPersona(Persona persona);
		
		List<Persona> getAllPersonas();
		Persona getIdPersona (int id);
		
		boolean deletePersona(int id);
		

}
