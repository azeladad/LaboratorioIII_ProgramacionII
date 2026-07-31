public class N2_Ejercicio10 {

    static class Cuenta {
        private double saldo;

        public Cuenta(double saldo) {
            this.saldo = saldo;
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

        public void mostrarSaldo() {
            System.out.println("Saldo actual: Q" + saldo);
        }
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1000.00);

        cuenta1.mostrarSaldo();
        cuenta1.depositar(500.00);
        cuenta1.mostrarSaldo();
        cuenta1.retirar(300.00);
        cuenta1.mostrarSaldo();
    }
}