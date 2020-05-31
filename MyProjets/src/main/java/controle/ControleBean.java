package controle;



import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.Dao;
import dao.DaoImplements;
import dao.EnderecodaoImplements;
import entidade.Endereco;
import entidade.Entidade;
import entidade.Telefone;

@ManagedBean(name= "ControleBean")
@SessionScoped

public class ControleBean {
	
	
	// variavel classe entidade
	private Entidade entidade;
	private Dao dao;
	private List<Entidade> listaEntidades;
	private ArrayList<Entidade> listaEntidade;
	
	
	
	// variavel classe telefone
	
	private Telefone telefone;
	private List<Telefone> listaTelefone;
	
	
	//variavel classe endereco
	private Endereco endereco;
    private EnderecodaoImplements enderecodao;
	private ArrayList<Endereco> listaEndereco;


	
	
	
	
	//Metodo Inicialização da classe	
	
	public ControleBean() {

		//Iniclialização da entidade 
		this.entidade = new Entidade();
		this.dao = new DaoImplements();
		this.listaEntidade = new ArrayList<Entidade>();
		
	    //inicialização dos telefones
		this.entidade.setTelefone(new Telefone());
		this.listaTelefone = this.dao.listarTelefone();
		this.listaTelefone =new ArrayList<Telefone>();

		//inicializar Endereço
		this.endereco = new Endereco();
		this.enderecodao = new EnderecodaoImplements();
		this.listaEndereco = new ArrayList<Endereco>();
		
		

	}
		
	
	
	
	
	
	
	
	
//Metodo Alterar
	
	public void alterarEntidade() {
this.listaEntidades = this.dao.listarTodos();
for (Entidade alterarEntidade : listaEntidades) {
this.dao.alterar(alterarEntidade);		
}
			
}		
		
		

	
	
	
	
	
	
//Metodo remover
	
	
	public void remover() {
          this.entidade = this.dao.remover(entidade);


	
		
	}
	
	
	

	
//Metodo Pesquisar
	
	
	public void pesquisar() {
		this.listaEntidades = this.dao.listarTodos();
		
		
		
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
// Metodo Inserir
	
	
	
	public void inserirEntidade() {
		
		
		Entidade novo = new Entidade();
		
		
		
		
		novo.setMatricula(this.entidade.getMatricula());
		novo.setNome(this.entidade.getNome());
		novo.setCpf(this.entidade.getCpf());
		novo.setRg(this.entidade.getRg());
		novo.setCtps(this.entidade.getCtps());
		novo.setEmail(this.entidade.getEmail());
		novo.setCargo(this.entidade.getCargo());
		novo.setSalario(this.entidade.getSalario());
		novo.setMatricula(this.telefone.getCelular());
		novo.setMatricula(this.telefone.getRecado());
		novo.setMatricula(this.telefone.getComercial());
		
		
		boolean incluiu = false;
		
		
		this.listaEntidades = this.dao.listarTodos();
		
		for(Entidade entidadePesquisa : listaEntidades) {
			if(entidadePesquisa.getMatricula().equals(this.entidade.getMatricula())){
				incluiu = true;
			}
		}
		
		if(incluiu) {
			
		}else {
			this.dao.inserir(novo);
			this.entidade = new Entidade();
			
		}
		
	
		
		
		
	}









	public Entidade getEntidade() {
		return entidade;
	}









	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}









	public Dao getDao() {
		return dao;
	}









	public void setDao(Dao dao) {
		this.dao = dao;
	}









	public List<Entidade> getListaEntidades() {
		return listaEntidades;
	}









	public void setListaEntidades(List<Entidade> listaEntidades) {
		this.listaEntidades = listaEntidades;
	}









	public ArrayList<Entidade> getListaEntidade() {
		return listaEntidade;
	}









	public void setListaEntidade(ArrayList<Entidade> listaEntidade) {
		this.listaEntidade = listaEntidade;
	}









	public Telefone getTelefone() {
		return telefone;
	}









	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}









	public List<Telefone> getListaTelefone() {
		return listaTelefone;
	}









	public void setListaTelefone(List<Telefone> listaTelefone) {
		this.listaTelefone = listaTelefone;
	}









	public Endereco getEndereco() {
		return endereco;
	}









	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}









	public EnderecodaoImplements getEnderecodao() {
		return enderecodao;
	}









	public void setEnderecodao(EnderecodaoImplements enderecodao) {
		this.enderecodao = enderecodao;
	}









	public ArrayList<Endereco> getListaEndereco() {
		return listaEndereco;
	}









	public void setListaEndereco(ArrayList<Endereco> listaEndereco) {
		this.listaEndereco = listaEndereco;
	}



}



