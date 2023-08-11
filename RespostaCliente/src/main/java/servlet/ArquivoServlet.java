package servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Arquivo")
public class ArquivoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		OutputStream out = null;
		FileInputStream fis = null;
		
		try {
			out = response.getOutputStream();
			
			response.addHeader("Content-Disposition", "attachment; filename=Curriculo_Paulo_Ricardo_Freire_Ultra.zip");
			
			response.setContentType("application/zip");
			
			fis = new FileInputStream("C:/Users/paulo.ultra/Documents/archive/Curriculo_Paulo_Ricardo_Freire_Ultra.zip");
			
			byte[] buffer = new byte[1024];
			int b;
			
			//Significa -> Leia o conteúdo o que está no fis para dentro do buffer e retorna o número de bytes lidos
			///Enquanto o valor de b for maior que -1 siginifica que ainda há o que ser lido
			while((b = fis.read(buffer)) > -1) {
				out.write(buffer, 0, b);
			}
			
		} finally {
			if(fis != null) {
				fis.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}

}
