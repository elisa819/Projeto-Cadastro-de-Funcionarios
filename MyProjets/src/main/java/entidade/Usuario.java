package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "USUARIO")
public class Usuario {
	
	
	
	@Id
	@Column(name = "EMAIL")
	private String email;
	
	
	
	@Column(name = "NOME")
	private String nome;
	
	
	
	
	@Column(name = "SENHA")
	private String senha;




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getSenha() {
		return senha;
	}




	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
	
	

}
