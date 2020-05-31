package dao;

import java.util.List;

import entidade.Endereco;
import entidade.Entidade;
import entidade.Telefone;


	
	public interface Dao {
		
		
		public void inserir (Entidade entidade);
		
		public void alterar (Entidade entidade);
		
	    public Entidade remover (Entidade entidade);
	    
	    public List<Entidade> listarTodos();
	    
	    public List<Telefone> listarTelefone();   
	   
	    public List<Endereco> listarEndereco();

		Entidade pesquisar(String matricula);
	    
	    
	    
	    
	    
	    
	    
	    

}
