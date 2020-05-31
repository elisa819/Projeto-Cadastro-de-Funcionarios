package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import dao.Usuariodao;
import dao.UsuariodaoImplements;
import entidade.Usuario;



@ManagedBean(name= "UsuarioBean")
@SessionScoped
public class UsuarioBean {
	

	private String cEmail;
	private String cSenha;
	private Usuario usuario;
	private Usuariodao usuariodao;
	private List<Usuario> listaUsuarios;
	private String msgdecadastro;
	
	
	
	
	//Inicialização da Lista de usuarios
	
	
	public UsuarioBean() {
		
		this.listaUsuarios = new ArrayList<Usuario>();
		this.usuario = new Usuario();
		this.usuariodao = new UsuariodaoImplements();
	}

	
	
	
///Metodo de acesso ao usuario com email e senha	
		
		
	public String entrar() {

		boolean achou = false;

		this.listaUsuarios = this.usuariodao.listarTodos();
		
		for (Usuario usuarioPesquisa : listaUsuarios) {

			if (usuarioPesquisa.getEmail().equals(this.cSenha) && usuarioPesquisa.getSenha().equals(this.cSenha)) {

				achou = true;
			}
		}

		if (achou) {
			return "funcionario.xhtml";
		} else {
			return "login.xhtml";
		}

	}


	
	
	
	public void criarUsuario() {

		Usuario novo = new Usuario();

		novo.setNome(this.usuario.getNome());
		novo.setEmail(this.usuario.getEmail());
		novo.setSenha(this.usuario.getSenha());

		boolean achou = false;
		
		this.listaUsuarios = this.usuariodao.listarTodos();
		
		for (Usuario usuarioPesquisa : listaUsuarios) {
			if (usuarioPesquisa.getEmail().equals(this.usuario.getEmail())) {
				achou = true;
			}
		}
		
		if(achou) {
			FacesContext.getCurrentInstance()
				.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Usuario já existe!!!"));
		}else {

			this.usuariodao.inserir(novo);
			
			this.usuario = new Usuario();	
		}
		
		
		
		
		
		
	}




	public String getcEmail() {
		return cEmail;
	}




	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}




	public String getcSenha() {
		return cSenha;
	}




	public void setcSenha(String cSenha) {
		this.cSenha = cSenha;
	}




	public Usuario getUsuario() {
		return usuario;
	}




	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}




	public Usuariodao getUsuariodao() {
		return usuariodao;
	}




	public void setUsuariodao(Usuariodao usuariodao) {
		this.usuariodao = usuariodao;
	}




	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}




	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}




	public String getMsgdecadastro() {
		return msgdecadastro;
	}




	public void setMsgdecadastro(String msgdecadastro) {
		this.msgdecadastro = msgdecadastro;
	}


}