package edu.ict.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.vo.StarVO;

@Controller
@RequestMapping("/star")
public class StarController {

	@GetMapping("/input")
	public String input() {
		return "star/input";
	}

	@GetMapping("/result")
	public String result(StarVO starVO) {
		return "star/star";
	}

}
