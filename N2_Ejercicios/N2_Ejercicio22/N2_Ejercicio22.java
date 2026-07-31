public class N2_Ejercicio22 {

    static class Empleado {
        private String nombre;
        private double salario;

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        public String getNombre() {
            return nombre;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Luis", 4500.00);

        System.out.println("Salario: Q" + empleado1.getSalario());
    }
}