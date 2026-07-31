public class N3_Ejercicio13 {

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

    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado(5);

        System.out.println("Cuadrado creado con lado: " + cuadrado1.lado);
    }
}