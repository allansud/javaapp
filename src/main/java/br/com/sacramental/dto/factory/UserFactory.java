package br.com.sacramental.dto.factory;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import br.com.sacramental.dominio.Role;
import br.com.sacramental.dominio.Usuario;
import br.com.sacramental.dto.JwtUserDto;

public class UserFactory {

	private UserFactory() {
	}

	public static Usuario create(JwtUserDto user) {
		return new Usuario(user.getId(), user.getUsername(), user.getFirstname(), user.getLastname(), user.getEmail(),
				user.getPassword(), mapToGrantedAuthorities(user.getAuthorities()), user.isEnabled(),
				user.getLastPasswordResetDate());
	}

	private static List<Role> mapToGrantedAuthorities(Collection<? extends GrantedAuthority> roles) {
		if (roles != null)
			roles.stream().map(role -> new Role(role.getAuthority())).collect(Collectors.toList());
		return null;
	}
}
