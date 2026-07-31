public class N1_Ejercicio12 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        try {
            int resultado = numeros[1] / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: posicion invalida en el arreglo");
        }
    }
}