package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.model.TipoDocumento;

public interface ITipoDocumentoJpa extends JpaRepository<TipoDocumento, Integer> {

}
