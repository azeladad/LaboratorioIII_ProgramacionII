public class N3_Ejercicio04 {

    static class Animal {
        protected String nombre;

        public Animal(String nombre) {
            this.nombre = nombre;
        }

        public void sonido() {
            System.out.println(nombre + " hace un sonido generico");
        }
    }

    static class Perro extends Animal {
        public Perro(String nombre) {
            super(nombre);
        }

        @Override
        public void sonido() {
            System.out.println(nombre + " dice: Guau Guau");
        }
    }

    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais");
        perro1.sonido();
    }
}