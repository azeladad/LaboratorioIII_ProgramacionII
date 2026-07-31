public class N1_Ejercicio07 {

    public static void validarNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }
        System.out.println("Numero valido: " + numero);
    }

    public static void main(String[] args) {
        try {
            validarNumero(-8);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}