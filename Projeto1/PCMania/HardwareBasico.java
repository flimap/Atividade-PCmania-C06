package Projeto1.PCMania;

public class HardwareBasico {
    private String nome;
    private float capacidade;

    public HardwareBasico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    //utilizando getters para acessar em outra classe
    public String getNome() {
        return nome;
    }

    public float getCapacidade() {
        return capacidade;
    }

}