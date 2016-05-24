package br.com.fiap.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.dao.GenericDao;
import br.com.fiap.entity.Usuario;

@WebServlet(
		name = "Servlet Login", 
		urlPatterns = { "/valida" }, 
		initParams = { 
				@WebInitParam(name = "user", value = "admin"), 
				@WebInitParam(name = "pwd", value = "admin")
		})
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		out.print("<h2>Bem vindo � aplica��o de cadastro de livros</h2>");
		request.getRequestDispatcher("login.jsp").include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");

		GenericDao<Usuario> dao = 
				new GenericDao<Usuario>(Usuario.class);
		
		try {
			Usuario usuario = dao.buscar(nome, senha);
			if(usuario != null){
				HttpSession session = request.getSession();
				session.setAttribute("usuario_sessao", usuario);
				response.sendRedirect("admin/menu.jsp");
			}
			else {
				request.setAttribute("msgValidacao", 
						"Usu�rio ou senha inv�lidos");
				request.getRequestDispatcher("login.jsp").forward(request, response);				
			}
		} catch (Exception e) {
			request.setAttribute("msgValidacao", e.getMessage());
			request.getRequestDispatcher("login.jsp").forward(request, response);				
		}
		
		
//		ServletConfig config = this.getServletConfig();
//		String user = config.getInitParameter("user");
		
		//Par�metros de inicializa��o do Servlet
//		String user = getServletConfig().getInitParameter("user");
//		String pwd = getServletConfig().getInitParameter("pwd");
//		
//		if(nome.equals(user) && senha.equals(pwd)){
//			response.sendRedirect("admin/menu.jsp");
//		}
//		else {
//			request.setAttribute("msgValidacao", "Usu�rio ou senha inv�lidos");
//			request.getRequestDispatcher("login.jsp").forward(request, response);
//			//response.sendRedirect("index.jsp");
//		}
		
	}
}






