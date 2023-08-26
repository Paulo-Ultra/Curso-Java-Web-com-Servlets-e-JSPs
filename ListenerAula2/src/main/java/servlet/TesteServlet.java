package servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Produto;

@WebServlet("/teste")
public class TesteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		Produto p = new Produto();
		//O HttpSessionBindingListener invocará o "p1"
		session.setAttribute("p1", p);
		
		String nomeProduto = p.getNome();
		System.out.println(nomeProduto);
	}

}
