public class N3_Ejercicio07 {

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

        @Override
        public void sonido() {
            System.out.println(nombre + " dice: Miau Miau");
        }
    }

    public static void main(String[] args) {
        Gato gato1 = new Gato("Michi");
        gato1.sonido();
    }
}