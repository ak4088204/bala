package com.webapp.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@Autowired
	Loginrepo linker;
    
	
	@PostMapping("/push")
	public void push(@RequestBody  Login l) {
		linker.save(l);
		
	}
	@ResponseBody
	@GetMapping("/get")
	public List gettt(){
		List list=linker.findAll();
		return list;
	}
	
	
}
