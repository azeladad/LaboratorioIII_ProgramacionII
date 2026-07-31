public class N1_Ejercicio15 {

    static class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException(String mensaje) {
            super(mensaje);
        }
    }

    public static void retirar(double saldo, double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("No hay saldo suficiente para retirar Q" + monto);
        }
        System.out.println("Retiro exitoso de Q" + monto);
    }

    public static void main(String[] args) {
        try {
            retirar(500.0, 800.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}