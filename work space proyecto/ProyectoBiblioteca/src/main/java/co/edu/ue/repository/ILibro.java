package co.edu.ue.repository;
import java.util.List;

import co.edu.ue.model.Libro;

public interface ILibro {
	List<Libro> addLibro (Libro libro);
	Libro uppLibro(Libro libro);
	
	List<Libro> getAllLibros();
	Libro getIdLibro (int id);
	
	boolean deleteLibro(int id);


}
