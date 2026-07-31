public class N1_Ejercicio05 {
    public static void main(String[] args) {
        try {
            int numero1 = 10;
            int numero2 = 0;
            int resultado = numero1 / numero2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero");
        } finally {
            System.out.println("Este mensaje se muestra siempre, haya error o no");
        }
    }
}