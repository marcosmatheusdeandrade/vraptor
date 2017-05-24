package br.com.caelum.vraptor.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.dao.DaoProduto;
import br.com.caelum.vraptor.entities.Produto;

@Controller
public class ProdutoController {

	@Inject
	private DaoProduto dao;
	
	@Get("/findAll")
	public List<Produto> findAll(){
		return dao.findAll(Produto.class);
	}
	
}
