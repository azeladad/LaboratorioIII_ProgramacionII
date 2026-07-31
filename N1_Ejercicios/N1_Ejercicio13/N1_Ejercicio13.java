public class N1_Ejercicio13 {
    public static void main(String[] args) {
        int stock = 0;

        try {
            if (stock == 0) {
                throw new RuntimeException("No hay stock disponible");
            }
            System.out.println("Stock disponible: " + stock);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}