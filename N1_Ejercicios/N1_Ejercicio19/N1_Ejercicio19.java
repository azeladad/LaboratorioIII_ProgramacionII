public class N1_Ejercicio19 {

    public static void validarNumero(int numero) {
        if (numero > 100) {
            throw new IllegalArgumentException("El numero no puede ser mayor a 100");
        }
        System.out.println("Numero valido: " + numero);
    }

    public static void main(String[] args) {
        try {
            validarNumero(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}