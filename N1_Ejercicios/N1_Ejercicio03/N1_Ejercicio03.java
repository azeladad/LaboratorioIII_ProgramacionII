public class N1_Ejercicio03 {
    public static void main(String[] args) {
        String texto = "abc";

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("El numero es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el texto no se puede convertir a numero");
        }
    }
}