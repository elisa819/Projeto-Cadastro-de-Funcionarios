package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.Enderecodao;
import dao.EnderecodaoImplements;
import entidade.Endereco;



@ManagedBean(name= "EnderecoBean")
@SessionScoped
public class EnderecoBean {
	
	
	
	
	private Endereco endereco;
	private Enderecodao enderecodao;
	private List<Endereco> listaEndereco;
	
	
	// Inicialização da lista de endereço
	
	public EnderecoBean() {
		
		this.endereco = new Endereco();
		this.enderecodao = new EnderecodaoImplements();
		this.listaEndereco = new ArrayList<Endereco>();
		
		
		
	
	}
	
	
	
	

			

		

		
	
	
	
	//Metodo incluir  o endereço
	
	public void salvar() {
		
		this.endereco = new Endereco();
		this.enderecodao.inserir(this.endereco);
	}


	
	
	///Getters e Setters
	

	public Endereco getEndereco() {
		return endereco;
	}



	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



	public Enderecodao getEnderecodao() {
		return enderecodao;
	}



	public void setEnderecodao(Enderecodao enderecodao) {
		this.enderecodao = enderecodao;
	}



	public List<Endereco> getListaEndereco() {
		return listaEndereco;
	}



	public void setListaEndereco(List<Endereco> listaEndereco) {
		this.listaEndereco = listaEndereco;
	}
	
	
	

}
