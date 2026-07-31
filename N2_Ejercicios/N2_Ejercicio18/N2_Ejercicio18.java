public class N2_Ejercicio18 {

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

        public double calcularPromedio() {
            double suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma = suma + notas[i];
            }
            return suma / notas.length;
        }
    }

    public static void main(String[] args) {
        double[] notas1 = {80, 90, 75};
        Estudiante estudiante1 = new Estudiante("Angel", notas1);

        System.out.println("El promedio es: " + estudiante1.calcularPromedio());
    }
}