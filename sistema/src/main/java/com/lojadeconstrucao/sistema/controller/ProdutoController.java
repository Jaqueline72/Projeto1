package com.lojadeconstrucao.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//annotation
@Controller
@RequestMapping("/Produto")
public class ProdutoController {
 
	@GetMapping
	public String abreFrmProduto() {
		return "forms/formularioproduto";
}
}