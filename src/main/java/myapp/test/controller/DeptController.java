package myapp.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public String deptAll(Model m) {
		List<Dept> dlist = dservice.deptAll();
		m.addAttribute("deptAll",dlist);

		return "dept/deptAll";
	}
	
	@GetMapping("/dept")
	public String deptForm(Model m) {
		List<Dept> dlist = dservice.deptAll();
		m.addAttribute("deptAll",dlist);
		return "dept/deptOne";
	}
	
	@RequestMapping("/dept/{no}")
	@ResponseBody
	public String deptOne(@PathVariable int no) {
		Dept d = dservice.deptOne(no);
		Gson gson = new Gson();
		String d_text = gson.toJson(d);
		System.out.println(d_text);
		return d_text;
	}
	
	@GetMapping("/insert")	
	public String insertDept(Model m) {
		int no = dservice.maxNo()+10;
		m.addAttribute("no",no);
		return "dept/insertForm";
	}
	@PostMapping("/insert")
	public String insert(Dept dept) {
		int i = dservice.addDept(dept);
		if(i != 0) {
			System.out.println(dept.getDeptno()+"遺��꽌 異붽�");
		}else {
			System.out.println(dept.getDeptno()+"遺��꽌 異붽� 紐삵븿");			
		}
		return "redirect:/";
	}
	
	@GetMapping("/delete/{no}")
	public String delete(@PathVariable("no") int deptno) {
		System.out.println("delete�닔�뻾");
		dservice.deleteDept(deptno);
		return "redirect:/deptAll";
	}
	
	@GetMapping("/update/{no}")
	public String updateForm(@PathVariable("no") int deptno, Model m) {
		Dept dept = dservice.deptOne(deptno);
		m.addAttribute("dept", dept);
		return "dept/updateForm"; 
	}
	@PostMapping("/update")
	public String update(Dept detp) {
		int i = dservice.updateDept(detp);
		return "redirect:/";
	}
	}
	


   
  
