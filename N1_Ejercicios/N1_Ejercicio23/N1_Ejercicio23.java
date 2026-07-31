import java.util.Scanner;
import java.util.InputMismatchException;

public class N1_Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa tu edad: ");
            int edad = sc.nextInt();
            System.out.println("Tu edad es: " + edad);
        } catch (InputMismatchException e) {
            System.out.println("Error: debes ingresar solo numeros");
        } finally {
            sc.close();
        }
    }
}