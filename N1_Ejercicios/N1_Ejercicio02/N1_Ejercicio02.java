import java.util.Scanner;
import java.util.InputMismatchException;

public class N1_Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa un numero: ");
            int numero = sc.nextInt();
            System.out.println("El numero ingresado es: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: debes ingresar un numero valido");
        }

        sc.close();
    }
}