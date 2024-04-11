package net.javaguides.springmvc.helloworld.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springmvc.helloworld.model.HelloWorld;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ramesh Fadatare
 */
@Controller
public class HelloWorldController {
	
//	@ResponseBody
//	@GetMapping("/")
//	public String handler(Model model) {
//
////		HelloWorld helloWorld = new HelloWorld();
////		helloWorld.setMessage("Hello World Example Using Spring MVC 5!!!");
////		helloWorld.setDateTime(LocalDateTime.now().toString());
////		model.addAttribute("helloWorld", helloWorld);
//		return "helloworld";
//	}


	@GetMapping("/helloworld")
	public String handler3() {
		return "helloworld";
	}

	@ResponseBody
	@GetMapping("/hello")
	public String handle(){
		return "Welcome Hello !!";
	}

	@ResponseBody
	@GetMapping("/step1")
	public String handle2(){
		return "step1";
	}

	@ResponseBody
	@GetMapping("/step2")
	public String handle3(){
		return "step2";
	}


	@ResponseBody
	@GetMapping("/template")
	public String velocityTemplate(){
		return "home";
	}
}