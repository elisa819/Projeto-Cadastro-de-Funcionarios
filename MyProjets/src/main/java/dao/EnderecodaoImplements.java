package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Util.JdbcUtil;
import entidade.Endereco;



public class EnderecodaoImplements implements Enderecodao {

	@Override
	public void inserir(Endereco endereco) {
		
		String sql = "insert into ENDERECO (cep, tipologradouro, logradouro, bairro, cidade, uf) (?,?,?,?,?,?)";
		
		
		Connection  conexao;

		try {
			
			conexao = JdbcUtil.getConexao();
			
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			ps.setString(1, endereco.getCep());
			ps.setString(2, endereco.getTipologradouro());
			ps.setString(3, endereco.getLogradouro());
			ps.setString(4, endereco.getBairro());
			ps.setString(5, endereco.getCidade());
			ps.setString(6, endereco.getUf());
			
			
			
			
			ps.execute();
			ps.close();
			
			
		}catch (SQLException e){
			e.printStackTrace();
		}		
		
		
	}

	@Override
	public void alterar(Endereco endereco) {
		
		
String sql = " UPDATE ENDERECO SET (cep = ?, tipologradouro = ?, logradouro = ?, bairro = ?, cidade = ?, uf = ? where cep = ?";

		 
		
		Connection  conexao;

		try {
			
			conexao = JdbcUtil.getConexao();
			
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			
			ps.setString(1, endereco.getCep());
			ps.setString(2, endereco.getTipologradouro());
			ps.setString(3, endereco.getLogradouro());
			ps.setString(4, endereco.getBairro());
			ps.setString(5, endereco.getCidade());
			ps.setString(6, endereco.getUf());
			
			
			
			
			ps.execute();
			ps.close();
			
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public void remover(Endereco endereco) {
		
		
String sql = " DELETE from ENDERECO cep = ?";
		
		
		Connection  conexao;

		try {
			
			conexao = JdbcUtil.getConexao();
			
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			
			ps.setString(1, endereco.getCep());
			
			
			
			
			ps.execute();
			ps.close();
			
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void pesquisar(Endereco endereco) {
	
		
String sql =  "select cep, from ENDERECO where cep = ?";


		
		
		Connection  conexao;

		try {
			
			conexao = JdbcUtil.getConexao();
			
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			
			ps.setString(1, endereco.getCep());
			ps.setString(2, endereco.getTipologradouro());
			ps.setString(3, endereco.getLogradouro());
			ps.setString(4, endereco.getBairro());
			ps.setString(5, endereco.getCidade());
			ps.setString(6, endereco.getUf());
			
			
			
			ps.execute();
			ps.close();
			
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
	}


	
	



    
    
    
    
	
	
	

}
