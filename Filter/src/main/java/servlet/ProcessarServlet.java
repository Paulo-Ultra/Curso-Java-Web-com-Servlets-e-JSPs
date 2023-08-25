package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/processar")
public class ProcessarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		PrintWriter out = null;
		
		try {
			out = response.getWriter();
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.getMessage();
			}
			out.print("Processamento realizado");
		} finally {
			if(out != null) {
				out.close();
			}
		}
	}

}
