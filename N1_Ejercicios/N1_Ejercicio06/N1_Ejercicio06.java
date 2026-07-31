import java.util.Scanner;

public class N1_Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa un numero: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                throw new IllegalArgumentException("El numero no puede ser negativo");
            }

            System.out.println("Numero valido: " + numero);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}