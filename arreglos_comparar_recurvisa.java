import java.util.Arrays;

public class ejercicio3 {
    public static void main(String[] args) {
        /**
         *
         *
         * A) Un algoritmo que reciba dos arreglos enteros de igual tamaño (n) e indique si son iguales o no (25 pts)
         */
        int[] arreglo1 = new int[]{3, 2, 4, 5};
        int[] arreglo2 = new int[]{1, 3 , 5, 4};
        int count = 0;

        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);

        String result = (recursividad(arreglo1, arreglo2, 0, count) > 0) ? "Son iguales" : "Son diferentes";
        System.out.println(result);

    }


    public static int recursividad(int[] arreglo1, int[] arreglo2, int i, int count) {
        if (arreglo1.length != arreglo2.length) {
            return 0;
        }

        if (arreglo1.length == 0 || arreglo2.length == 0) {
            return 0;
        }

        if (i < arreglo1.length) {
            if (arreglo1[i] != arreglo2[i]) {
                return 0;
            } else {
                return recursividad(arreglo1, arreglo2, i + 1, count + 1);
            }
        }

        return count;
    }
}

/**
 * public static int recursividad (int [] arreglo1 , int [] arreglo2,boolean bandera, int i, int count) {
 * if (arreglo1.length != arreglo2.length) {
 * return 0;
 * }
 * <p>
 * if (arreglo1.length == 0 || arreglo2.length == 0 || count == 0 ) {
 * return 0;
 * }
 * <p>
 * if (i < arreglo1.length) {
 * if (arreglo1[i] == arreglo2[i]) {
 * System.out.println("son iguales");
 * return recursividad(arreglo1, arreglo2, bandera == true,i + 1, count);
 * }
 * else if (arreglo1[i]!= arreglo2[i]){
 * System.out.println("Son diferentes");
 * return recursividad(arreglo1, arreglo2, bandera== false,i + 1, count);
 * }
 * }
 * <p>
 * return i;
 * }
 **/
