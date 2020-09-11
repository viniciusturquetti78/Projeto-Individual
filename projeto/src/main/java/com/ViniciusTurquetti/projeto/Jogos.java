package com.ViniciusTurquetti.projeto;

public class Jogos extends Produto {
    private String nome;
    private String plataforma;

    public Jogos(Integer codigo, Double precoCusto, String nome, String plataforma) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.plataforma = plataforma;
    }

    @Override
    public Double getValorTotal() {
        return getPrecoCusto() * 1.10;
    }

    public String getNome() {
        return nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Jogos{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}' + super.toString();
    }


}
