public class N2_Ejercicio03 {

    static class Persona {
        private String nombre;
        private int edad;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa");
            }
            this.edad = edad;
        }
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Carlos");

        try {
            persona1.setEdad(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}