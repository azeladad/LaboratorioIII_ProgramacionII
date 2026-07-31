public class N3_Ejercicio03 {

    static class Animal {
        protected String nombre;

        public Animal(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void sonido() {
            System.out.println(nombre + " hace un sonido generico");
        }
    }

    static class Perro extends Animal {
        public Perro(String nombre) {
            super(nombre);
        }
    }

    public static void main(String[] args) {
        Perro perro1 = new Perro("Firulais");
        perro1.sonido();
    }
}