package edu.ict.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import edu.ict.ex.vo.GradeVO;

@Controller
@RequestMapping("/grade")
public class GradeControler {
	
	@GetMapping("/form")
	public String form() {
		return "grade/input";
	}

	@PostMapping("/gredTot")
	public String grade(GradeVO gradeVO) {

		return "grade/result";
	}

}
