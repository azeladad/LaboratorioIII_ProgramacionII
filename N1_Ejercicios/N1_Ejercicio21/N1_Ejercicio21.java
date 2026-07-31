public class N1_Ejercicio21 {

    public static void validarEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("El email no tiene un formato valido");
        }
        System.out.println("Email valido: " + email);
    }

    public static void main(String[] args) {
        try {
            validarEmail("correo_invalido");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}