public class N1_Ejercicio22 {

    public static void validarLongitud(String texto, int maximo) {
        if (texto.length() > maximo) {
            throw new IllegalArgumentException("El texto excede la longitud maxima de " + maximo + " caracteres");
        }
        System.out.println("Texto valido: " + texto);
    }

    public static void main(String[] args) {
        try {
            validarLongitud("Este es un texto demasiado largo para el limite", 20);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}