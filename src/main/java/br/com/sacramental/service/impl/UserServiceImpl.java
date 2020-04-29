package br.com.sacramental.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sacramental.dominio.Usuario;
import br.com.sacramental.repository.UsuarioRepository;

@Service
public class UserServiceImpl {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void saveUser(Usuario usuario) {
		usuarioRepository.save(usuario);		
	}
}
