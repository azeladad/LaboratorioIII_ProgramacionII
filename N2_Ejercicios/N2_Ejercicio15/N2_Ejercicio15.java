import java.util.ArrayList;

public class N2_Ejercicio15 {

    static class Producto {
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        public void mostrarProducto() {
            System.out.println("Producto: " + nombre + " - Precio: Q" + precio);
        }
    }

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Laptop", 4500.00));
        productos.add(new Producto("Mouse", 85.50));
        productos.add(new Producto("Teclado", 150.00));

        for (Producto p : productos) {
            p.mostrarProducto();
        }
    }
}