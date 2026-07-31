public class N2_Ejercicio06 {

    static class Cuenta {
        private double saldo;

        public Cuenta(double saldo) {
            this.saldo = saldo;
        }

        public double getSaldo() {
            return saldo;
        }
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(1000.00);

        System.out.println("Saldo inicial: Q" + cuenta1.getSaldo());
    }
}