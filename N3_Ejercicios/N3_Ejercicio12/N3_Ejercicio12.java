public class N3_Ejercicio12 {

    static abstract class Figura {
        protected String nombre;

        public Figura(String nombre) {
            this.nombre = nombre;
        }

        public abstract double area();
    }

    public static void main(String[] args) {
        System.out.println("Metodo abstracto area() agregado correctamente");
    }
}