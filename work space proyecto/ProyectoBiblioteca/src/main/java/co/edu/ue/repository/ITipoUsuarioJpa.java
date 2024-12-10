package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.TipoUsuario;

public interface ITipoUsuarioJpa extends JpaRepository<TipoUsuario, Integer>{

}
