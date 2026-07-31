import java.util.ArrayList;

public class N3_Ejercicio10 {

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
        animales.add(new Animal("Criatura"));

        System.out.println("Ejecutando sonido() en " + animales.size() + " objetos distintos:");
        for (Animal a : animales) {
            a.sonido();
        }
    }
}