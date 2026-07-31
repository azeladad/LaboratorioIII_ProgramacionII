import java.util.ArrayList;

public class N3_Ejercicio08 {

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
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Michi"));

        System.out.println("Lista de animales creada con " + animales.size() + " elementos");
    }
}