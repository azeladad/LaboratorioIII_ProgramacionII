public class N1_Ejercicio14 {

    static class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException(String mensaje) {
            super(mensaje);
        }
    }

    public static void main(String[] args) {
        System.out.println("Clase de excepcion personalizada creada correctamente");
    }
}