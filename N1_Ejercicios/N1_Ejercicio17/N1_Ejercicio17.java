public class N1_Ejercicio17 {
    public static void main(String[] args) {
        String palabra = "Java";

        try {
            char letra = palabra.charAt(10);
            System.out.println("La letra es: " + letra);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: esa posicion no existe en el texto");
        }
    }
}