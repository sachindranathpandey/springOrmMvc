package springormmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springormmvc.entity.Student;
import springormmvc.service.StudentService;


@Controller
public class SignUpControllerHandel {


	@Autowired
	StudentService studentService;
	
	@RequestMapping(path = "/register",method = RequestMethod.POST)
	public String signup(@ModelAttribute("std") Student student, Model model) {
//		model.addAttribute("name", student.getName());
//		model.addAttribute("email",student.getEmail());
//		model.addAttribute("password",student.getPassword());
		
		this.studentService.createStudent(student);
		
		return "sign-up-success";
	}
}
