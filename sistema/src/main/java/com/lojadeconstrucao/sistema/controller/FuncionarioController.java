package com.lojadeconstrucao.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//annotation
@Controller
@RequestMapping("/Funcionario")
public class FuncionarioController {
   
	@GetMapping
	public String abreFrmFuncionario() {
		return "forms/formulariofuncionario";
}
}