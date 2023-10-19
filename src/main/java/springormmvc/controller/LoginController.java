package springormmvc.controller;



import javax.servlet.http.HttpServletRequest;

import org.apache.jasper.EmbeddedServletOptions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) {
		
		ModelAndView andView=new ModelAndView();
		andView.addObject("email",request.getParameter("email"));
		andView.addObject("password",request.getParameter("password"));
		andView.setViewName("login-success");
		
		System.out.println(request.getParameter("email")+request.getParameter("password"));
	
		return andView;
	}
	

}
