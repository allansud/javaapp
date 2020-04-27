package br.com.sacramental.dominio;

import org.springframework.data.annotation.Id;

public class Usuario {

	@Id
	private String id;
	private String nome;
	private String sobreNome;
	private String email;
	private String Senha;
	
	public Usuario (String id, String nome, String sobreNome, String email, String senha) {
		this.email = email;
		this.id = id;
		this.nome = nome;
		this.Senha = senha;
		this.sobreNome = sobreNome;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	
	
}
