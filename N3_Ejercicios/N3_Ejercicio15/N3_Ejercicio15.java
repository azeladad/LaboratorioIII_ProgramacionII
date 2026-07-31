public class N3_Ejercicio15 {

    static abstract class Figura {
        protected String nombre;

        public Figura(String nombre) {
            this.nombre = nombre;
        }

        public abstract double area();
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
        Circulo circulo1 = new Circulo(4);

        System.out.println(circulo1.nombre + " con radio " + circulo1.radio + " tiene area: " + circulo1.area());
    }
}