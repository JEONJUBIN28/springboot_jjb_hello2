package edu.ict.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ict.ex.vo.TriangleVO;
import edu.ict.ex.vo.CircleVO;
import edu.ict.ex.vo.RectangleVO;


@Controller
@RequestMapping("/shape")
public class shapeController {

	@GetMapping("/form")
	public String form() {
		return "shape/area";
	}
	
	@GetMapping("/recArea")
	public String recArea(@ModelAttribute("rectangle")RectangleVO rectangleVO, Model model ) {
			
		return "shape/areaRec";
	}
	
	@PostMapping("/triArea")
	public String triArea(TriangleVO triangleVO) {
		
		return "shape/areaTri";
	}
	
	@PostMapping("/circleArea")
	public String circleArea(CircleVO circleVO) {
		
		return "shape/areaCir";
	}
	

}
