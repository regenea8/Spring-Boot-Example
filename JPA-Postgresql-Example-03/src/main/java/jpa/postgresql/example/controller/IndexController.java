package jpa.postgresql.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jpa.postgresql.example.model.Board;
import jpa.postgresql.example.service.IndexService;

@Controller    // This means that this class is a Controller
//@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class IndexController {
	
	@Autowired 
	private IndexService indexService;

	@RequestMapping("/index")
	public void index(Model model){
		List list = (List) indexService.findAll();
		/*
		 * for (int i = 0; i < list.size(); i++) { System.out.println(((Board)
		 * list.get(i)).get);
		 * 
		 * }
		 */
		model.addAttribute("list", list);
	}
	
	@ResponseBody
	@RequestMapping("/ajax")
	public List ajax() throws Exception {

		List list = null;
		
		try {
			list = (List) indexService.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
}