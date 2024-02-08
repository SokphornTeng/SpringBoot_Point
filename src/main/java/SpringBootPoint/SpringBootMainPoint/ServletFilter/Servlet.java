package SpringBootPoint.SpringBootMainPoint.ServletFilter;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Component
public class Servlet implements Filter {
	
//	In doFilter() method, we have added the System.out.println statements to print the remote host and remote address.

	@Override
	   public void destroy() {}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
		
		System.out.print("Remote Host"+request.getRemoteHost());
		System.out.print("Remote Add"+request.getRemoteAddr());
		chain.doFilter(request, response);
	}
	
	@Override
	   public void init(FilterConfig filterconfig) throws ServletException {}

}
