package entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name= "ENDERECO")
public class Endereco {
	
	
	@Id
	@Column(name= "CEP")
	private String cep;
	
	@Column(name= "TIPOLOGRADOURO")
	private String tipologradouro;
	
	@Column(name= "LOGRADOURO")
	private String logradouro;
	
	@Column(name= "BAIRRO")
	private String bairro;
	
	@Column(name= "CIDADE")
	private String cidade;
	
	@Column(name= "UF")
	private String uf;
	
	@OneToMany (mappedBy= "ENDERECO", cascade= CascadeType.ALL)
	private List<Endereco> endereco;
	

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTipologradouro() {
		return tipologradouro;
	}

	public void setTipologradouro(String tipologradouro) {
		this.tipologradouro = tipologradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
	
	


}
