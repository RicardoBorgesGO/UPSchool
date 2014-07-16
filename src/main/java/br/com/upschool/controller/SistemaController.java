package br.com.upschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sistema")
public class SistemaController {

	@RequestMapping(method = RequestMethod.GET)
	public String renderSistema() {
		return "system/index";
	}
}
