public class N2_Ejercicio09 {

    static class Cuenta {
        private double saldo;

        public Cuenta(double saldo) {
            if (saldo < 0) {
                throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
            }
            this.saldo = saldo;
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double monto) {
            if (monto < 0) {
                throw new IllegalArgumentException("El monto a depositar no puede ser negativo");
            }
            saldo = saldo + monto;
        }

        public void retirar(double monto) {
            if (monto > saldo) {
                throw new IllegalArgumentException("Saldo insuficiente para retirar Q" + monto);
            }
            saldo = saldo - monto;
        }
    }

    public static void main(String[] args) {
        try {
            Cuenta cuenta1 = new Cuenta(-200.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}