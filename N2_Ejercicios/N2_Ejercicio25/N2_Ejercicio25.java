import java.util.ArrayList;

public class N2_Ejercicio25 {

    static class Empleado {
        private String nombre;
        private double salario;

        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        public void mostrarDatos() {
            System.out.println("Nombre: " + nombre + " - Salario: Q" + salario);
        }
    }

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado("Luis", 4500.00));
        empleados.add(new Empleado("Ana", 5200.00));
        empleados.add(new Empleado("Carlos", 3800.00));

        for (Empleado e : empleados) {
            e.mostrarDatos();
        }
    }
}