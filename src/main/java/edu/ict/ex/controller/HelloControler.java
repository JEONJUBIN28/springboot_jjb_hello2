package edu.ict.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//1.HelloController 객체 생성을 안하고 있음
//new HelloController

//<bean id="student1" class="com.javalec.ex.Student"></bean>
//@Component + controller
//@Component = @Bean
@Controller
public class HelloControler {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String hello() {
		return"home"; ///WEB-INF/views/home.jsp
	}
	
	@GetMapping("/board/view")
	public String boardView() {
		return"board/view"; //board/view.jsp
	}
	
	@GetMapping("/board/content")
	public String boardcontent(Model model) {
		
		model.addAttribute("id", 30);
		model.addAttribute("name", "홍길동");
		model.addAttribute("age", 21);
		
		return"board/content"; //board/content.jsp
	}
	
	@GetMapping("/board/reply")
	public ModelAndView boardreply() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",30);
		mv.setViewName("board/reply");
				
		return mv;
	}
}
