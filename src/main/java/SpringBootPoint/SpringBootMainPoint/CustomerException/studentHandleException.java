package SpringBootPoint.SpringBootMainPoint.CustomerException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class studentHandleException {

	@ExceptionHandler(value = stuNotFoundException.class)
	public ResponseEntity<Object> exception(stuNotFoundException myException){
		
		return new ResponseEntity<Object>("Student Info not found", HttpStatus.NOT_FOUND);
		
	}
	
}
