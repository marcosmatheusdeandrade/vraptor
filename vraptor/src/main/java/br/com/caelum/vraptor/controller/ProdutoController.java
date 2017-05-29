package br.com.caelum.vraptor.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.DaoProduto;
import br.com.caelum.vraptor.entities.Produto;

@Controller
public class ProdutoController {

	@Inject
	private DaoProduto dao;
	
	@Inject
	private Result result;
	
	@Get("/findAll")
	public List<Produto> findAll(){
		return dao.findAll(Produto.class);
	}
	
	public void formulario(){
		
	}
	
	public void adiciona(Produto produto) {
		dao.merge(produto);
		result.redirectTo(this).findAll();

//		result.forwardTo("/uma/outra/pagina.jsp")
//		result.redirectTo("/uma/outra/pagina.jsp")
	}
	
}
