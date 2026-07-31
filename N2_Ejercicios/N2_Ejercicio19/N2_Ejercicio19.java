public class N2_Ejercicio19 {

    static class Estudiante {
        private String nombre;
        private double[] notas;

        public Estudiante(String nombre, double[] notas) {
            this.nombre = nombre;
            this.notas = notas;
        }

        public double calcularPromedio() {
            double suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma = suma + notas[i];
            }
            return suma / notas.length;
        }

        public void mostrarResultado() {
            double promedio = calcularPromedio();
            System.out.println("Nombre: " + nombre);
            System.out.println("Promedio: " + promedio);

            if (promedio >= 61) {
                System.out.println("Estado: Aprobado");
            } else {
                System.out.println("Estado: Reprobado");
            }
        }
    }

    public static void main(String[] args) {
        double[] notas1 = {80, 90, 75};
        Estudiante estudiante1 = new Estudiante("Angel", notas1);

        estudiante1.mostrarResultado();
    }
}