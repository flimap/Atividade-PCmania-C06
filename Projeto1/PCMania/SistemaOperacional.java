package Projeto1.PCMania;

public class SistemaOperacional {
    private String nome;
    private int tipo;

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    //utilizando getters para acessar em outra classe
    public String getNome() {
        return nome;
    }

    public int  getTipo() {
        return tipo;
    }

}