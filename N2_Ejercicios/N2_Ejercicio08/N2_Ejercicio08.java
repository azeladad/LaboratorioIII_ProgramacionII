public class N2_Ejercicio08 {

    static class Cuenta {
        private double saldo;

        public Cuenta(double saldo) {
            this.saldo = saldo;
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double monto) {
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
        Cuenta cuenta1 = new Cuenta(1000.00);

        try {
            cuenta1.retirar(1500.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}