package es.http.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaController {
	
	@RequestMapping("/")
	public String hola() {
		return "hola";
	}
	
}
