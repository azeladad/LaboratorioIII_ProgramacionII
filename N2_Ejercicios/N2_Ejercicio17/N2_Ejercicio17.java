public class N2_Ejercicio17 {

    static class Estudiante {
        private String nombre;
        private double[] notas;

        public Estudiante(String nombre, double[] notas) {
            this.nombre = nombre;
            this.notas = notas;
        }

        public String getNombre() {
            return nombre;
        }

        public double[] getNotas() {
            return notas;
        }
    }

    public static void main(String[] args) {
        double[] notas1 = {80, 90, 75};
        Estudiante estudiante1 = new Estudiante("Angel", notas1);

        System.out.println("Notas agregadas correctamente para: " + estudiante1.getNombre());
    }
}