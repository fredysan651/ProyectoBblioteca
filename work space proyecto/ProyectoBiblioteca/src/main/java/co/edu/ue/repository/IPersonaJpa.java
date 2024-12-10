package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.Persona;

public interface IPersonaJpa extends JpaRepository<Persona , Integer>{

}
