import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        /***
         * A) Método de Gauss-Jordan para la solución de un sistema lineal de ecuaciones (3 ecuaciones, 3 incógnitas)
         * (25 pts)
         */
        int i, j, k, n;
        float result;
        String literales = "xyz";
        n = 3;

        float[][] matriz = {
                {2,1,-1,8},
                {-3,-1,2,-11},
                {-2,1,2,-3}
        };

        for (i = 0; i < n; i++) {
            if (matriz[i][i] == 0.0) {
                System.err.println("No hay división entre cero.\n");
                return;
            }
            for (k = 0; k < n; k++) {
                if (k != i) {
                    result = matriz[k][i] / matriz[i][i];
                    for (j = 0; j <= n; j++) {
                        matriz[k][j] -= result * matriz[i][j];
                    }
                }
            }
        }

        System.out.println("Resultado:\n");
        for (i = 0; i < n; i++) {
            result = matriz[i][n] / matriz[i][i];
            System.out.println(literales.charAt(i) + " = " + result);
        }
        System.out.println();
    }
}


