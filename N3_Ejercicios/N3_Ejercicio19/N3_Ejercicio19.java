public class N3_Ejercicio19 {

    interface Vehiculo {
        void encender();
        void apagar();
    }

    static class Carro implements Vehiculo {
        private String marca;

        public Carro(String marca) {
            this.marca = marca;
        }

        @Override
        public void encender() {
            System.out.println("El carro " + marca + " esta encendido");
        }

        @Override
        public void apagar() {
            System.out.println("El carro " + marca + " esta apagado");
        }
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota");
        carro1.encender();
        carro1.apagar();
    }
}