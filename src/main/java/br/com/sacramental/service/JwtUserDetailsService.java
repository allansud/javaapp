package br.com.sacramental.service;

import java.util.ArrayList;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.sacramental.dominio.Usuario;
import br.com.sacramental.repository.UsuarioRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	private UsuarioRepository usuarioRepository;

	public JwtUserDetailsService(UsuarioRepository repository) {
		this.usuarioRepository = repository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByUsername(username);
		if (usuario == null)
			throw new UsernameNotFoundException(username);
		return new User(usuario.getEmail(), usuario.getPassword(), new ArrayList<GrantedAuthority>());
	}
}
