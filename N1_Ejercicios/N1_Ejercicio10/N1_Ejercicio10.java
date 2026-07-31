public class N1_Ejercicio10 {

    public static void validarContrasena(String contrasena) {
        if (contrasena.length() < 8) {
            throw new IllegalArgumentException("La contrasena debe tener al menos 8 caracteres");
        }
        System.out.println("Contrasena valida");
    }

    public static void main(String[] args) {
        try {
            validarContrasena("pablo1");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}