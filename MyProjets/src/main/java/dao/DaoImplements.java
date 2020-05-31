package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Util.JdbcUtil;
import entidade.Endereco;
import entidade.Entidade;
import entidade.Telefone;


public class DaoImplements implements Dao {

	@Override
	public void inserir(Entidade entidade) {
		
		String sql = "insert into FUNCIONARIO (matricula, nome, endereco, bairro, cidade, uf, cep, telefone, email, cargo, salario) (?,?,?,?,?,?,?,?,?,?,?)";
		
		
		Connection  conexao;

		try {
			
			conexao = JdbcUtil.getConexao();
			
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			
			ps.setString(1, entidade.getMatricula());
			ps.setString(2, entidade.getNome());
			ps.setString(3, entidade.getCpf());
			ps.setString(4, entidade.getRg());
			ps.setString(5, entidade.getCtps());
			ps.setString(5, entidade.getEmail());
			ps.setString(6, entidade.getCargo());
			ps.setString(7, entidade.getSalario());
			
			
			
			
			ps.execute();
			ps.close();
			
			
		}catch (SQLException e){
			e.printStackTrace();
		}		
		
		
	}

	@Override
	public void alterar(Entidade entidade) {
		
		
String sql = " UPDATE FUNCIONARIO SET (matricula = ?, nome = ?, endereco = ?, bairro = ?, cidade = ?, uf = ?, cep = ?, telefone = ?, email = ?, cargo = ?, salario = ?";

		 
		
		Connection  conexao;

		try {
			
			conexao = JdbcUtil.getConexao();
			
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			
			ps.setString(1, entidade.getMatricula());
			ps.setString(2, entidade.getNome());
			ps.setString(3, entidade.getCpf());
			ps.setString(4, entidade.getRg());
			ps.setString(5, entidade.getCtps());
			ps.setString(5, entidade.getEmail());
			ps.setString(6, entidade.getCargo());
			ps.setString(7, entidade.getSalario());
			
			
			
			
			ps.execute();
			ps.close();
			
			
		}catch (SQLException e){
			e.printStackTrace();
		}
	}

	@Override
	public Entidade remover(Entidade entidade) {
		
		
String sql = " DELETE FROM FUNCIONARIO matricula = ?";
		
		
		Connection  conexao;

		try {
			
			conexao = JdbcUtil.getConexao();
			
			
			PreparedStatement ps = conexao.prepareStatement(sql);
			
			
			ps.setString(1, entidade.getMatricula());
			
			
			
			
			ps.execute();
			ps.close();
			
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		return null;
		
	}

	@Override
	public Entidade pesquisar(String matricula) {
	
		
String sql =  "select  matricula, nome, endereco, bairro, cidade, uf, cep, telefone, email, cargo, salario  where matricula";


		
		
		Connection  conexao;

		try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
			ResultSet res = ps.executeQuery();
			
			ps.setString(1,  matricula);
			
			while (res.next()) {
				
				Entidade entidade = null;
				entidade = new Entidade();
			ps.setString(1, entidade.getMatricula());
			ps.setString(2, entidade.getNome());
			ps.setString(3, entidade.getCpf());
			ps.setString(4, entidade.getRg());
			ps.setString(5, entidade.getCtps());
			ps.setString(5, entidade.getEmail());
			ps.setString(6, entidade.getCargo());
			ps.setString(7, entidade.getSalario());
			
			
			
			ps.execute();
			ps.close();
			}
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		return null;
	
		
	}


	
	
	public List<Entidade> listarTodos() {
		
		
		String sql =  "select  matricula, nome, endereco, bairro, cidade, uf, cep, telefone, email, cargo, salario from FUNCIONARIO" +
		              "select cep, tipologradouro, logradouro, bairro,cidade, uf" +
				      "select celular, recado, comercial";
		        


		List<Entidade> listarEntidade = new ArrayList<Entidade>();	
				
				Connection  conexao;
				try {
					conexao = JdbcUtil.getConexao();
					PreparedStatement ps = conexao.prepareStatement(sql);
					ResultSet res = ps.executeQuery();
					
					
					
					while (res.next()) {
						Entidade entidade = new Entidade();
					ps.setString(1, entidade.getMatricula());
					ps.setString(2, entidade.getNome());
					ps.setString(3, entidade.getCpf());
					ps.setString(4, entidade.getRg());
					ps.setString(5, entidade.getCtps());
					ps.setString(5, entidade.getEmail());
					ps.setString(6, entidade.getCargo());
					ps.setString(7, entidade.getSalario());
					
					 Endereco endereco = new Endereco();
                     endereco.setCep(res.getString("CEP"));
                     endereco.setTipologradouro(res.getString("TIPOLOGRADOURO"));
                     endereco.setLogradouro(res.getString("LOGRADOURO"));  
                     endereco.setBairro(res.getString("BAIRRO"));
                     endereco.setCidade(res.getString("CIDADE"));                
                     endereco.setUf(res.getString("UF"));
					
                     Telefone telefone = new Telefone();
                     telefone.setCelular(res.getString("CELULAR"));
                     telefone.setRecado(res.getString("RECADO"));
                     telefone.setComercial(res.getString("COMERCIAL"));  
                  
					entidade.setEndereco(endereco);
					entidade.setTelefone(telefone);
			        listarEntidade.add(entidade);
					}
					
					ps.close();
			
					
					
				}catch (SQLException e){
					e.printStackTrace();
				}
				return listarEntidade;
				
			}
    
public List<Telefone> listarTelefone() {
	
		
String sql =  "select celular, recado, comercial, FROM TELEFONE ";

List<Telefone> listaTelefone = new ArrayList<Telefone>();
		
		
		Connection  conexao;
           try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet res = ps.executeQuery();
			

                        while (res.next()){
                        Telefone telefone = new Telefone();
                        telefone.setCelular(res.getString("CELULAR"));
                        telefone.setRecado(res.getString("RECADO"));
                        telefone.setComercial(res.getString("COMERCIAL"));  
                     

                        
			            listaTelefone.add(telefone);
			
		
			ps.close();
			
}
			
		}catch (SQLException e){
			e.printStackTrace();
		}
           
           return listaTelefone;
		
	}

    
    
    
public List<Endereco> listarEndereco() {
	
	
String sql =  "select cep, tipologradouro, logradouro, bairro, cidade, uf Endereco, from ENDERECO ";


		
		List<Endereco> listaendereco = new ArrayList<Endereco>();
	
		
		Connection  conexao;
         try {
			conexao = JdbcUtil.getConexao();
			PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet res = ps.executeQuery();
			

                       
                        while (res.next()) {
                        Endereco endereco = new Endereco();
                        endereco.setCep(res.getString("CEP"));
                        endereco.setTipologradouro(res.getString("TIPOLOGRADOURO"));
                        endereco.setLogradouro(res.getString("LOGRADOURO"));  
                        endereco.setBairro(res.getString("BAIRRO"));
                        endereco.setCidade(res.getString("CIDADE"));                
                        endereco.setUf(res.getString("UF"));
                       

                     
                     


			            listaendereco.add(endereco);
		
			ps.close();
			
}
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		return listaendereco;
		
	}





	
	
	    
    
	
	
	

}

