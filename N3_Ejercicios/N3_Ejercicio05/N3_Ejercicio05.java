public class N3_Ejercicio05 {

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
        Animal animalGenerico = new Animal("Criatura");
        Perro perro1 = new Perro("Firulais");

        System.out.println("--- Prueba de Animal ---");
        animalGenerico.sonido();

        System.out.println("--- Prueba de Perro ---");
        perro1.sonido();
    }
}