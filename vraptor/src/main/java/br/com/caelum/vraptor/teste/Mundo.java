package br.com.caelum.vraptor.teste;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class Mundo {

	@Inject
	private Result result;
	
	@Get("/boasVindas")
	public void boasVindas(){
		result.include("ola", "Olá!");
	}
	
	@Get("/paises")
	public List<String> paises(){
		List<String> paises = new ArrayList<>();
		paises.add("Brasil");
		paises.add("Argentina");
		
		return paises;
	}
}
