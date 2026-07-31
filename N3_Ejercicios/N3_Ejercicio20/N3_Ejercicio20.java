import java.util.ArrayList;

public class N3_Ejercicio20 {

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

    static class Moto implements Vehiculo {
        private String marca;

        public Moto(String marca) {
            this.marca = marca;
        }

        @Override
        public void encender() {
            System.out.println("La moto " + marca + " esta encendida");
        }

        @Override
        public void apagar() {
            System.out.println("La moto " + marca + " esta apagada");
        }
    }

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Carro("Toyota"));
        vehiculos.add(new Moto("Honda"));

        System.out.println("--- Encendiendo todos los vehiculos ---");
        for (Vehiculo v : vehiculos) {
            v.encender();
        }

        System.out.println("\n--- Apagando todos los vehiculos ---");
        for (Vehiculo v : vehiculos) {
            v.apagar();
        }
    }
}