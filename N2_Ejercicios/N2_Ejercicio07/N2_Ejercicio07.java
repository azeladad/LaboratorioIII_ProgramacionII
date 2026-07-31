public class N2_Ejercicio07 {

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
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1000.00);
        cuenta1.depositar(500.00);

        System.out.println("Saldo despues de depositar: Q" + cuenta1.getSaldo());
    }
}