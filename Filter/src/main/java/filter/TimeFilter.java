package filter;

import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class TimeFilter extends HttpFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		HttpServletRequest req = (HttpServletRequest) request;
		
		long inicio = System.currentTimeMillis();
		
		//Faz com que o Filter faça a próxima chamada de um Filter ou do Servlet
		chain.doFilter(request, response);
		
		long fim = System.currentTimeMillis();
		
		long time = fim - inicio;
		
		FileWriter fw = new FileWriter("C:/Users/paulo.ultra/Documents/Estudos PucRs/Softblue/Servlets e JSP's/Filter/time.txt", true);
		fw.write("URI " + req.getRequestURI() + ": " +time + "ms");
		//Utiliza a quebra de linha padrão da plataforma em que é executada a requisição
		fw.write(System.getProperty("line.separator"));
		
		fw.close();
		
	}
	

	
	public void init(FilterConfig fConfig) throws ServletException {

	}
	
	public void destroy() {

	}

}
