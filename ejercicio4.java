import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        /**
         * B) Dado un arreglo de enteros de tamaño (n) evaluar si alguno de los números contenido en el arreglo
         * concuerda con el índice de la posición donde esta almacenado (25 puntos)
         *
         *
         * */
        int [] arr3 = {0,1,2,3,4,5,6,7,8};
        leer(arr3, 7);
        }
        public static void leer(int datos[], int posicion){
            if (posicion != datos.length - 1) {
                if (posicion == datos[posicion]) {
                    System.out.println("El numero coincide con el indice " + "(Posicion " + posicion + " = " + "Valor "+ datos[posicion] + ")");
                }
            else {
                    leer(datos, posicion+1);
                }
            }
            if (posicion == datos.length - 1) {
                System.out.println("El numero no coincide con su indice!");
            }
        }
}

