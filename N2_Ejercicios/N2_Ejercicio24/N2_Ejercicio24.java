public class N2_Ejercicio24 {

    static class Empleado {
        private String nombre;
        private double salario;

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            setSalario(salario);
        }

        public void setSalario(double salario) {
            if (salario < 0) {
                throw new IllegalArgumentException("El salario no puede ser negativo");
            }
            this.salario = salario;
        }

        public void mostrarDatos() {
            System.out.println("Nombre: " + nombre + " - Salario: Q" + salario);
        }
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Luis", 4500.00);
        empleado1.mostrarDatos();
    }
}