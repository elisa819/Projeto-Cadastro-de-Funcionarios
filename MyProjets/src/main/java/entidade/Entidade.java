package entidade;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name= "FUNCIONARIO")

public class Entidade {

	
	

	@Id
	@Column(name= "MATRICULA", nullable = false)
	private String matricula;
	
	@Column(name= "NOME")
	private String nome;
	
	@Column(name= "CPF")
	private String cpf;
	
	@Column(name= "RG")
	private String rg;
	
	@Column(name= "CTPS")
	private String ctps;
	
	@Column(name= "EMAIL")
	private String  email;
	
	@Column(name="CARGO")
	private String cargo;
	
	@Column(name= "SALARIO")
	private String salario;
	
	
	
	@ManyToOne
	@JoinColumn (name = "TELEFONE" , referencedColumnName = "matricula", nullable = false)
	private Telefone telefone;
	
	
	@ManyToOne
	@JoinColumn (name = "ENDERECO" , referencedColumnName = "matricula", nullable = false)
	private Endereco endereco;


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getCtps() {
		return ctps;
	}


	public void setCtps(String ctps) {
		this.ctps = ctps;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getSalario() {
		return salario;
	}


	public void setSalario(String salario) {
		this.salario = salario;
	}


	public Telefone getTelefone() {
		return telefone;
	}


	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	
	
	
	
	


	
	
	
	
	
	

}
