package com.eheinen.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.eheinen.dao.GenericDao;
import com.eheinen.entity.Usuario;

@ManagedBean
@RequestScoped
public class UsuariosBean {
	private Usuario usuario;
	
	public UsuariosBean() {
		usuario = new Usuario();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	// método de ação (action), que retorna o redirecionamento
	// conforme o resultado da execução
	public String validarUsuario() {
		try {
			GenericDao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
			Usuario getUsuario = dao.buscar(usuario.getNome(), usuario.getSenha());
			
			System.out.println(getUsuario);
			if(getUsuario != null){
				FacesContext context = FacesContext.getCurrentInstance();
				context.getExternalContext().getSessionMap().put("usuario_sessao", getUsuario);
				
				return "admin/menu"; // dispatching para menu.xhtml
			}
			else
				return "login"; // dispatching para erro.xhtml
		} catch (Exception e) {
			return "login"; // dispatching para erro.xhtml
		}
	}

}