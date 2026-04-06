package Projeto1.PCMania;


public class Computador {

        private String marca;
        private float preco;
        private HardwareBasico[] hardwares;
        private SistemaOperacional sistemaOperacional;
        private MemoriaUSB memoriaUSB;

        public Computador(String marca, float preco, HardwareBasico[] hardwares, SistemaOperacional sistemaOperacional, MemoriaUSB mUSB) {

            this.marca = marca;
            this.preco = preco;
            this.hardwares = hardwares;
            this.sistemaOperacional = sistemaOperacional;
            this.memoriaUSB = mUSB;

        }

        public float getPreco() {
        return preco;
        }

        public void addMemoriaUSB(MemoriaUSB mUSB){
            this.memoriaUSB = mUSB;
        }

        void mostraPCConfigs(){
            System.out.println("Marca: " + marca);
            System.out.println("Preco: " + preco);

            for (HardwareBasico hardware : hardwares) {
                if(hardware != null)
                    System.out.println("Hardware: " + hardware.getNome() + " -  Capacidade: " + hardware.getCapacidade());
            }

            System.out.println("Sistema Op: " + sistemaOperacional.getNome() + " " + sistemaOperacional.getTipo() + " bits");

            if (memoriaUSB != null) {
                System.out.println("Memoria USB: " + memoriaUSB.getNome() + " Capacidade: " + memoriaUSB.getCapacidade() + "GB");
            }
        }
}