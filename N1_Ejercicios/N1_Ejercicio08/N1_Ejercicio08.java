public class N1_Ejercicio08 {

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int resultado = dividir(20, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero");
        }
    }
}