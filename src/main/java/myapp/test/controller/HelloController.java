package myapp.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/hello")
	
	//화면 출력할 데이터(모델에 담는다)
	public String hello(Model m) {
		System.out.println();
		m.addAttribute("hello", "hello,spring!!");//m(모델)에다가 addattribute속성으로 저장 시킨다( 이름, 값)
		return "hello";//view 정보
	}	
	
	

} 
