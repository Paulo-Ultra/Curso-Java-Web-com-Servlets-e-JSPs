package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet(
		urlPatterns = { "/*" }, 
		initParams = { 
				@WebInitParam(name = "adminEmail", value = "admin@sistema.com")
		}, loadOnStartup=2)
public class AutoInit2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet 2 carregado");
	}

}
