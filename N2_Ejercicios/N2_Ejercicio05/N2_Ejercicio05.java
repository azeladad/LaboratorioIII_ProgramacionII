public class N2_Ejercicio05 {

    static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public void mostrarDatos() {
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        }
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Maria", 28);
        persona1.mostrarDatos();
    }
}