public class ExerciciJavaMath5 {
    public static void main(String[] args) {
        /*
         * Escribe un snippet que imprima por pantalla el resultado de multiplicar dos
         * números enteros. **No se puede utilizar el operador ``*``**.
         * 
         * int a = 5, b = 11;
         */

        System.out.println("Multiplicación de dos números sin usar el *");

        int a = 5, b = 11, resultado = 0;

        for (int i = 0; i < b; i++) {
            if (i < b) {
                resultado = resultado + a;
            }
        }
        a = resultado;
        System.out.println("5 * 11 = " + a);
    }
}
