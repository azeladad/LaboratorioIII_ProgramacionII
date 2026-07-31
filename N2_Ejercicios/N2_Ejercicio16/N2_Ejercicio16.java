public class N2_Ejercicio16 {

    static class Estudiante {
        private String nombre;

        public Estudiante(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Angel");

        System.out.println("Estudiante creado: " + estudiante1.getNombre());
    }
}