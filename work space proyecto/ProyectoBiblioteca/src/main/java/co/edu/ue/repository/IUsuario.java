package co.edu.ue.repository;

import java.util.List;

import co.edu.ue.model.Usuario;

public interface IUsuario {
	
		List<Usuario> addUsuario (Usuario usuario);
		Usuario uppUsuario(Usuario usuario);
		
		List<Usuario> getAllUsuarios();
		Usuario getIdUsuario (int id);
		
		boolean deleteUsuario(int id);


}
