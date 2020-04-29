package br.com.sacramental.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.sacramental.dominio.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String>{
	
	Usuario findByFirstName(String firstname);
	List<Usuario> findByLastName(String lastname);
	Usuario findByUsername(String username);
}
