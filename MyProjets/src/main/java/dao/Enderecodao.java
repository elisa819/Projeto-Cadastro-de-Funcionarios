package dao;

import entidade.Endereco;


	
	public interface Enderecodao {
		
		
		public void inserir (Endereco endereco);
		
		public void alterar (Endereco endereco);
		
	    public void remover (Endereco endereco);
	    
	    public void pesquisar(Endereco endereco);

}
