import java.util.Scanner;
import java.util.InputMismatchException;

public class N1_Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            try {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Sumar dos numeros");
                System.out.println("2. Dividir dos numeros");
                System.out.println("3. Salir");
                System.out.print("Elige una opcion: ");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Numero 1: ");
                        int a = sc.nextInt();
                        System.out.print("Numero 2: ");
                        int b = sc.nextInt();
                        System.out.println("La suma es: " + (a + b));
                        break;

                    case 2:
                        System.out.print("Numero 1: ");
                        int c = sc.nextInt();
                        System.out.print("Numero 2: ");
                        int d = sc.nextInt();
                        System.out.println("La division es: " + (c / d));
                        break;

                    case 3:
                        System.out.println("Saliendo del programa...");
                        salir = true;
                        break;

                    default:
                        System.out.println("Opcion invalida");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar solo numeros");
                sc.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Error: no se puede dividir entre cero");
            }
        }

        sc.close();
    }
}