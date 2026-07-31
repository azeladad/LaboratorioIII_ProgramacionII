public class N1_Ejercicio20 {

    public static void procesarPago(double monto) {
        if (monto <= 0) {
            throw new RuntimeException("El monto del pago debe ser mayor a cero");
        }
        System.out.println("Pago procesado por Q" + monto);
    }

    public static void main(String[] args) {
        try {
            procesarPago(-50.0);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}