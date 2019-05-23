package jpa.postgresql.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
//@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class IndexController {
	//@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	//private UserService userService;

	@RequestMapping("/index")
	public void index(){
		
	}
	
	@ResponseBody
	@RequestMapping("/ajax")
	public String download() throws Exception {

		String result = "";
		
		try {
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
	
}