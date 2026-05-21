package br.com.gustamba.livraria.produtos;

import br.com.gustamba.livraria.Autor;

public class MiniLivro extends Livro{
    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        return false;
    }

    @Override
    public double getValor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValor'");
    }
}