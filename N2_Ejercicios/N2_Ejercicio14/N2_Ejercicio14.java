public class N2_Ejercicio14 {

    static class Producto {
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            setPrecio(precio);
        }

        public void setPrecio(double precio) {
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo");
            }
            this.precio = precio;
        }

        public void mostrarProducto() {
            System.out.println("Producto: " + nombre + " - Precio: Q" + precio);
        }
    }

    public static void main(String[] args) {
        Producto producto1 = new Producto("Teclado", 150.00);
        producto1.mostrarProducto();
    }
}