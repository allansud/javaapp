package br.com.sacramental.dto.factory;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import br.com.sacramental.dominio.Role;
import br.com.sacramental.dominio.Usuario;
import br.com.sacramental.dto.JwtUserDto;

public class JwtUserFactory {
	
	private JwtUserFactory() {
	}

	public static JwtUserDto create(Usuario user) {
		return new JwtUserDto(user.getId(), user.getUsername(), user.getFirstname(), user.getLastname(), user.getEmail(),
				user.getPassword(), mapToGrantedAuthorities(user.getRoles()), user.getEnabled(),
				user.getLastPasswordResetDate());
	}

	private static List<GrantedAuthority> mapToGrantedAuthorities(List<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRoleName()))
				.collect(Collectors.toList());
	}
}
