package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
//ctrl + Y apaga linha

        Gato gato = new Gato();
        System.out.println(gato);

        Livro Livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(Livro1);
/*
        ctrl + shift + / comenta o bloco
        int a = 5, b = 3;
        System.out.println("hello world! " + (a+b));*/


    }
}
class Livro{

    private String nome;
    private Integer numPagina;


    public Livro(String nome, Integer numPagina) {
        this.nome = nome;
        this.numPagina = numPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }
}
