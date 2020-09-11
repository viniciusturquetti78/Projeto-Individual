package com.ViniciusTurquetti.projeto;

public class Livros extends Produto {
    private String nomeLivro;
    private String autor;

    public Livros(Integer codigo, Double precoCusto, String nomeLivro, String autor) {
        super(codigo, precoCusto);
        this.nomeLivro = nomeLivro;
        this.autor = autor;
    }

    @Override
    public Double getValorTotal() {
        return getPrecoCusto() * 1.20;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nomeLivro='" + nomeLivro + '\'' +
                ", autor='" + autor + '\'' +
                '}' + super.toString();
    }
}
