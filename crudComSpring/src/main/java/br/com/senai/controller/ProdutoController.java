package br.com.senai.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.model.Produto;
import br.com.senai.repository.ProdutoRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/produtos")
@AllArgsConstructor
public class ProdutoController {
	
	private ProdutoRepository produtorepository;
	
	@GetMapping
	public List<Produto> listaProdutos() {
		return produtorepository.findAll();
	}

}
