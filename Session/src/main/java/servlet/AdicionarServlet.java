package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Carrinho;
import model.Produto;

@WebServlet("/adicionar")
public class AdicionarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		Produto p = Produto.getProdutosById(id);
		
		HttpSession session = request.getSession();
		
		Carrinho carrinho = (Carrinho) session.getAttribute("carrinho");
		
		
		//Por algum motivo usar o método equals() não funciona
		if(carrinho == null) {
			carrinho = new Carrinho();
			session.setAttribute("carrinho", carrinho);
		}
		
		carrinho.add(p);
		
		request.getRequestDispatcher("/listar").forward(request, response);
	}

}
