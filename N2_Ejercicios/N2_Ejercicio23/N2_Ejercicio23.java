public class N2_Ejercicio23 {

    static class Empleado {
        private String nombre;
        private double salario;

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            setSalario(salario);
        }

        public String getNombre() {
            return nombre;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            if (salario < 0) {
                throw new IllegalArgumentException("El salario no puede ser negativo");
            }
            this.salario = salario;
        }
    }

    public static void main(String[] args) {
        try {
            Empleado empleado1 = new Empleado("Luis", -2000.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}