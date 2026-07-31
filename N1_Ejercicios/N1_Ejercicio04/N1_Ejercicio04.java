public class N1_Ejercicio04 {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error personalizado: intentaste acceder a una posicion que no existe en el arreglo");
        }
    }
}