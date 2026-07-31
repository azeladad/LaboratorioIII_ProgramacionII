public class N3_Ejercicio01 {

    static class Animal {
        protected String nombre;

        public Animal(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Rex");

        System.out.println("Animal creado: " + animal1.getNombre());
    }
}