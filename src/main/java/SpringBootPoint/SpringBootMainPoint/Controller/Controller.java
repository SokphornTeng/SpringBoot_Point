package SpringBootPoint.SpringBootMainPoint.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootPoint.SpringBootMainPoint.Model.student;

@RestController
public class Controller {

	  private static Map<String, student> infoStu = new HashMap<String, student>();
	  static {
		  student stu1 = new student();
		  stu1.setId("01");
		  stu1.setName("Sokphorn");
		  stu1.setAge("20");
		  infoStu.put(stu1.getId(), stu1);
		  
		  student stu2 = new student();
		  stu2.setId("02");
		  stu2.setName("Vuthe");
		  stu2.setAge("19");
		  infoStu.put(stu2.getId(), stu2);
	  }
	  @GetMapping("/list")
	  public ResponseEntity<Object> Listing() throws Exception{
		 
		  try {
			  return new ResponseEntity<Object>(infoStu.values(), HttpStatus.OK);
		} catch (Exception e) {
			throw new Exception();
		}
		 
		
	  }
}
