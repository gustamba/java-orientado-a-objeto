package br.com.gustamba.livraria.teste;

import br.com.gustamba.livraria.produtos.Livro;
import br.com.gustamba.livraria.produtos.Produto;

public class CarrinhoDeCompras {
    
    private double total;
    private Produto[] produtos = new Produto[10];

    public void adiciona(Livro livro) {
        System.out.println("Adicionando: " + livro);
        //livro.aplicaDescontoDe(0.15);
        total += livro.getValor();
    }

    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " + produto);
        total += produto.getValor();
    }

    public double getTotal() {
        return total;
    }
}
