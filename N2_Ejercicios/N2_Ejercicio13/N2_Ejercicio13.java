public class N2_Ejercicio13 {

    static class Producto {
        private String nombre;
        private double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            setPrecio(precio);
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo");
            }
            this.precio = precio;
        }
    }

    public static void main(String[] args) {
        try {
            Producto producto1 = new Producto("Mouse", -50.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}