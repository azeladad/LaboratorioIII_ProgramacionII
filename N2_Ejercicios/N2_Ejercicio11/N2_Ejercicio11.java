public class N2_Ejercicio11 {

    static class Producto {
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }
    }

    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 4500.00);

        System.out.println("Producto creado: " + producto1.getNombre());
    }
}