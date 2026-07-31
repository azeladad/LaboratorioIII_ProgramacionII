public class N1_Ejercicio11 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        try {
            System.out.println("Posicion 5: " + numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: la posicion que intentas leer no existe en el arreglo");
        }
    }
}