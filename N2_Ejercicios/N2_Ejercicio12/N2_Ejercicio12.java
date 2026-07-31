public class N2_Ejercicio12 {

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

        public void setPrecio(double precio) {
            this.precio = precio;
        }
    }

    public static void main(String[] args) {
        Producto producto1 = new Producto("Laptop", 4500.00);
        producto1.setPrecio(4200.00);

        System.out.println("Nuevo precio: Q" + producto1.getPrecio());
    }
}