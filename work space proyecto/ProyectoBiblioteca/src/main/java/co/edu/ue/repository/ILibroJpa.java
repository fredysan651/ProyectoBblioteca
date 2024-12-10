package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.Libro;

public interface ILibroJpa extends JpaRepository<Libro, Integer >{

}
