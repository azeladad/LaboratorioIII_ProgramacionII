import java.util.ArrayList;

public class N3_Ejercicio17 {

    static abstract class Figura {
        protected String nombre;

        public Figura(String nombre) {
            this.nombre = nombre;
        }

        public abstract double area();
    }

    static class Cuadrado extends Figura {
        private double lado;

        public Cuadrado(double lado) {
            super("Cuadrado");
            this.lado = lado;
        }

        @Override
        public double area() {
            return lado * lado;
        }
    }

    static class Circulo extends Figura {
        private double radio;

        public Circulo(double radio) {
            super("Circulo");
            this.radio = radio;
        }

        @Override
        public double area() {
            return Math.PI * radio * radio;
        }
    }

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Cuadrado(5));
        figuras.add(new Circulo(4));

        for (Figura f : figuras) {
            System.out.println(f.nombre + " - Area: " + f.area());
        }
    }
}