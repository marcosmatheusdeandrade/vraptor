package br.com.caelum.vraptor.teste;

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
}
