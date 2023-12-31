package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Properties;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String key = request.getParameter("key");
		
		if(key != null) {
			String value = Properties.getValue(key);
			
			request.setAttribute("key", key);
			request.setAttribute("value", value);
		}
		
		request.getRequestDispatcher("/edit.jsp").forward(request, response);
	}

}
