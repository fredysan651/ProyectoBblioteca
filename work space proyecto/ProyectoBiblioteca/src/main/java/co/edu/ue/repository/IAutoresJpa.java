package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.Autores;

public interface IAutoresJpa extends JpaRepository<Autores, Integer > {

}
