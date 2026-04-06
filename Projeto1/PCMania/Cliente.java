package Projeto1.PCMania;

public class Cliente{

    private String nome;
    private String cpf;
    private Computador[] computadores = new Computador[5];

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addComputador(Computador novoComputador) {
        for(int i = 0; i < computadores.length; i++){//Varrendo o array de computadores
            if(computadores[i] == null){//Verifica se não existe computador para adicionar
                computadores[i] = novoComputador;
                break; //Adiciona e sai do metodo
            }
        }

    }

    public float calculaTotalCompra() {
        float totalCompra = 0;
        for(int i = 0; i < computadores.length; i++) {//Varrendo o array de computadores
            if (computadores[i] != null) {//Verifica se existe computador para somar
                totalCompra += computadores[i].getPreco();
            }
        }
        return totalCompra;
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}