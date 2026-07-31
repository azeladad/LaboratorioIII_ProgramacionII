public class N2_Ejercicio21 {

    static class Empleado {
        private String nombre;

        public Empleado(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Luis");

        System.out.println("Empleado creado: " + empleado1.getNombre());
    }
}