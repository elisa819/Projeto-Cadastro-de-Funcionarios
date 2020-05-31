package entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


	
	
	@Entity
	@Table(name= "TELEFONE")
	public class Telefone {
		
		
		@Id
		@Column(name= "CELULAR")
		private String celular;
		
		@Column(name= "RECADO")
		private String recado;
		
		@Column(name= "comercial")
		private String comercial;
		
		
		
		@OneToMany (mappedBy= "TELEFONE", cascade= CascadeType.ALL)
		private List<Telefone> telefone;



		public String getCelular() {
			return celular;
		}



		public void setCelular(String celular) {
			this.celular = celular;
		}



		public String getRecado() {
			return recado;
		}



		public void setRecado(String recado) {
			this.recado = recado;
		}



		public String getComercial() {
			return comercial;
		}



		public void setComercial(String comercial) {
			this.comercial = comercial;
		}



		public List<Telefone> getTelefone() {
			return telefone;
		}



		public void setTelefone(List<Telefone> telefone) {
			this.telefone = telefone;
		}


	}
	
