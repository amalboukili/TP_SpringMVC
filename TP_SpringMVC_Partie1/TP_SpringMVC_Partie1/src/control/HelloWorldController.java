package control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
@RequestMapping("/index1")
public ModelAndView hello(){
	String msg = "Ma première page Spring MVC";
	return new ModelAndView("hello", "message", msg);
}
}
