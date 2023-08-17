package com.lojadeconstrucao.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//annotation
@Controller
@RequestMapping("/Venda")
public class VendaController {

	@GetMapping
	public String abreFrmVenda() {
		return "forms/formulariovenda";
}
}
