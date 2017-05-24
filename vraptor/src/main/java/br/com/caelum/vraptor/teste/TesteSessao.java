package br.com.caelum.vraptor.teste;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.vraptor.dao.DaoProduto;
import br.com.caelum.vraptor.entities.Produto;

public class TesteSessao {

	public static void main(String[] args) {

		try {

			DaoProduto daoProduto = new DaoProduto();
			List<Produto> findAll = daoProduto.findAll(Produto.class);
			
			
			
//			Produto find = new DaoProduto().find(Produto.class, 9l);
			
			new DaoProduto().remove(Produto.class, 9l);
			
//			System.out.println(find);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Produto getProduto() {
		Produto produto = new Produto();
		produto.setId(8l);
		produto.setNome("update");
		produto.setDescricao("teste inserção");
		produto.setPreco(BigDecimal.TEN);
		return produto;
	}
}
