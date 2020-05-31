package dao;

import java.util.List;

import entidade.Usuario;

public interface Usuariodao {
		
		
		public void inserir (Usuario usuario);
		
		public void alterar (Usuario usuario);
	
	    public void remover (Usuario usuario);
	      
	    public List<Usuario> listarTodos();

		public Usuario pesquisar(String email);
	    

}


