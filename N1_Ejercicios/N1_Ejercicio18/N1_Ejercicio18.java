public class N1_Ejercicio18 {

    public static double dividirSeguro(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            double resultado = dividirSeguro(15, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}