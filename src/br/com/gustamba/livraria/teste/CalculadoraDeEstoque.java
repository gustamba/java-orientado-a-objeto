package br.com.gustamba.livraria.teste;

import br.com.gustamba.livraria.Autor;
import br.com.gustamba.livraria.produtos.Livro;
import br.com.gustamba.livraria.produtos.LivroFisico;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		Livro livro = new LivroFisico(autor);
		livro.setValor(59.90);

		System.out.println("Valor atual: " + livro.getValor());

		//livro.valor -= livro.valor * 0.1;

		if (!livro.aplicaDescontoDe(0.1)){
			System.out.println("Desconto não pode ser maior do que 30%");
		}
		livro.aplicaDescontoDe(0.1);

		System.out.println("Valor com desconto: " + livro.getValor());
	}
}
