package myapp.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import myapp.test.scott.dto.Dept;
import myapp.test.scott.service.DeptService;

@Controller
public class DeptController {
	
	@Autowired
	DeptService dservice;
	
	@GetMapping("/deptAll")
	public String deptALl (Model m) {
		List<Dept> dlist =dservice.deptAll();
		m.addAttribute("deptAll",dlist);
		
		return "dept/deptAll";
		
	}
   @GetMapping("/dept")
   public String deptForm(Model m) {
	   List<Dept> dlist =dservice.deptAll();
		m.addAttribute("deptAll",dlist);   
	   return "dept/deptOne";
   }
   @RequestMapping("/dept/{no}")
   @ResponseBody
   public String deptOne(@PathVariable int no) {
	   Dept d= dservice.deptOne(no);
	   
	   Gson gson = new Gson();
	   String d_text = gson.toJson(d); //tojsom 자바객체-> jason문자열로 만들어줌.
	   System.out.println(d_text); 
	   return d_text;
	   
   
}
}
