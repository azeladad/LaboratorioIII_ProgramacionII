public class N3_Ejercicio06 {

    static class Animal {
        protected String nombre;

        public Animal(String nombre) {
            this.nombre = nombre;
        }

        public void sonido() {
            System.out.println(nombre + " hace un sonido generico");
        }
    }

    static class Gato extends Animal {
        public Gato(String nombre) {
            super(nombre);
        }
    }

    public static void main(String[] args) {
        Gato gato1 = new Gato("Michi");

        System.out.println("Gato creado: " + gato1.nombre);
    }
}