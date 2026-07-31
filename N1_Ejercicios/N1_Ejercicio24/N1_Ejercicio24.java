import java.util.Scanner;
import java.util.InputMismatchException;

public class N1_Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean entradaValida = false;
        int numero = 0;

        while (!entradaValida) {
            try {
                System.out.print("Ingresa un numero: ");
                numero = sc.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: eso no es un numero, intenta de nuevo");
                sc.nextLine();
            }
        }

        System.out.println("Numero ingresado correctamente: " + numero);
        sc.close();
    }
}