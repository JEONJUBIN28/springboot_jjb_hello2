package edu.ict.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/board")
public class BoardControler {
	
	@GetMapping("/write")
	public String write(Model model) {
		model.addAttribute("board","게시판 글");
		
		return "board/write";
	}
	
	@GetMapping("/insert")
	public String insert(Model model) {
		
		return "board/insert";
		
	}
	
}
