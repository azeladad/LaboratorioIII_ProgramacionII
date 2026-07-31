public class N2_Ejercicio20 {

    static class Estudiante {
        private String nombre;
        private double[] notas;

        public Estudiante(String nombre, double[] notas) {
            this.nombre = nombre;
            validarNotas(notas);
            this.notas = notas;
        }

        private void validarNotas(double[] notas) {
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] < 0 || notas[i] > 100) {
                    throw new IllegalArgumentException("Las notas deben estar entre 0 y 100");
                }
            }
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
        double[] notasInvalidas = {80, 150, 75};

        try {
            Estudiante estudiante1 = new Estudiante("Angel", notasInvalidas);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}