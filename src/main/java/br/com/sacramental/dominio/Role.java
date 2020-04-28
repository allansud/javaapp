package br.com.sacramental.dominio;

import org.springframework.data.mongodb.core.mapping.MongoId;

public class Role {

	@MongoId
	private Long id;

	private String RoleName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String roleName) {
		RoleName = roleName;
	}
}
