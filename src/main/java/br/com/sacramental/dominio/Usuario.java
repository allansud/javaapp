package br.com.sacramental.dominio;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.MongoId;

public class Usuario {

	@MongoId
	private Long id;

	private String username;

	private String password;

	private String firstName;

	private String lastName;

	private String email;

	private Boolean enabled;

	private Date lastPasswordResetDate;

	private List<Role> roles;

	public Usuario(Long id, String username, String firstname, String lastname, String email, String password,
			List<Role> roles, boolean enabled, Date lastPasswordResetDate) {
		this.id = id;
		this.username = username;
		this.firstName = firstname;
		this.lastName = lastname;
		this.email = email;
		this.password = password;
		this.enabled = enabled;
		this.lastPasswordResetDate = lastPasswordResetDate;
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstname() {
		return firstName;
	}

	public String getLastname() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public Date getLastPasswordResetDate() {
		return lastPasswordResetDate;
	}

	public List<Role> getRoles() {
		return roles;
	}
}
