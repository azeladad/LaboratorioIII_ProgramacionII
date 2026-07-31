public class N1_Ejercicio16 {

    public static void validarTexto(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            throw new IllegalArgumentException("El texto no puede estar vacio");
        }
        System.out.println("Texto valido: " + texto);
    }

    public static void main(String[] args) {
        try {
            validarTexto("   ");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}