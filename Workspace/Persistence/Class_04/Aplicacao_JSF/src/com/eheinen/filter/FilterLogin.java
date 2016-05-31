package com.eheinen.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eheinen.entity.Usuario;

@WebFilter("/admin/*")
public class FilterLogin implements Filter {

    public FilterLogin() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpSession session = 
				((HttpServletRequest)request).getSession();
		
		Usuario usuario = 
				(Usuario)session.getAttribute("usuario_sessao"); 
		System.out.println("usuariooo " + usuario);
		if(usuario == null){
			((HttpServletResponse)response).
			      sendRedirect("/Aplicacao_JSF/login.faces");
		}
		else {
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
