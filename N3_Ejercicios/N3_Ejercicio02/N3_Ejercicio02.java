public class N3_Ejercicio02 {

    static class Animal {
        protected String nombre;

        public Animal(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    static class Perro extends Animal {
        public Perro(String nombre) {
            super(nombre);
        }
    }

    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais");

        System.out.println("Perro creado: " + perro1.getNombre());
    }
}