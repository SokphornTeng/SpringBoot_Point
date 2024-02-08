package SpringBootPoint.SpringBootMainPoint.componentConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Component
public class studentInterceptorConfig extends WebMvcConfigurationSupport {

	@Autowired
	private studentInterceptor stuInterceptor;
  
	  @Override
	   public void addInterceptors(InterceptorRegistry registry) {
	      registry.addInterceptor(stuInterceptor);
	   }
	
	
}
