package br.com.sacramental.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.sacramental.dominio.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{
	
	public Usuario findByFirstName(String firstName);
	public List<Usuario> findByLastName(String lastName);
}
