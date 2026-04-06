package Projeto1.PCMania;

import java.util.Scanner;

// Classe principal que simula o uso do sistema
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Criando clientes
        Cliente cliente = new Cliente("Flávia", "241.120.022.00");


        // Criando as promoções da loja com preços baseados na matrícula (217)
        Computador promo1 = new Computador("Apple", 217, // matrícula
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i3", 2200),
                        new HardwareBasico("Memória RAM", 8),
                        new HardwareBasico("HD", 500)
                },
                new SistemaOperacional("macOS Sequoia", 64),
                new MemoriaUSB("Pen-drive", 16)
        );

        Computador promo2 = new Computador("Samsung", 1451, // matrícula + 1234 = 1451
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i5", 3370),
                        new HardwareBasico("Memória RAM", 16),
                        new HardwareBasico("HD", 1000)
                },
                new SistemaOperacional("Windows 8", 64),
                new MemoriaUSB("Pen-drive", 32)
        );

        Computador promo3 = new Computador("Dell", 5895, // matrícula + 5678 = 5895
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i7", 4500),
                        new HardwareBasico("Memória RAM", 32),
                        new HardwareBasico("HD", 2000)
                },
                new SistemaOperacional("Windows 10", 64),
                new MemoriaUSB("HD Externo", 1000)
        );

        int opcao;
        do {
            // Menu para o usuário escolher
            System.out.println("Digite o código da promoção (1,2,3) ou 0 para sair:");
            opcao = entrada.nextInt();

            if(opcao == 1){
                cliente.addComputador(promo1);
                System.out.println("Promoção 1 adicionada!");
            }
            else if(opcao == 2){
                cliente.addComputador(promo2);
                System.out.println("Promoção 2 adicionada!");
            }
            else if(opcao == 3){
                cliente.addComputador(promo3);
                System.out.println("Promoção 3 adicionada!");
            }
            else if(opcao != 0){
                System.out.println("Opção inválida!");
            }

        } while(opcao != 0);

        // Mostrar informações do cliente e da compra
        System.out.println("Cliente: " + cliente.getNome() + " - CPF: " + cliente.getCpf());

        // Exibir os computadores comprados
        for(int i = 0; i < cliente.getComputadores().length; i++) {
            if(cliente.getComputadores()[i] != null) {
                cliente.getComputadores()[i].mostraPCConfigs();
            }
        }

        // Exibir total da compra
        System.out.println("Total da compra: R$ " +  cliente.calculaTotalCompra());

        // Enviar pedido
        ProcessarPedido.enviarPedido(cliente.getComputadores());

        entrada.close();
    }
}