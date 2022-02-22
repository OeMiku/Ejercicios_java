import java.util.Arrays;

public class ejercicio2 {
    public static void main(String[] args) {
        /**
         * B) Método de multiplicación de matrices de (N filas, M columnas) x (M filas, N columnas) (25 puntos)
         */
        int matrizA[][] = {{2,3,-3},{9,0,-2},{7,-4,1}};
        int matrizB[][] = {{5,1,4},{1,6,0},{1,-5,4}};
        int multi[][] = new int[matrizA.length][matrizB[0].length];

        if (matrizA[0].length == matrizB.length) {
            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizB[0].length; j++) {
                    for (int k = 0; k < matrizA[0].length; k++) {
                        multi[i][j] += (matrizA[i][k] * matrizB[k][j]);
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(multi));
    }
}
