
import java.util.Scanner;
/**
 * Programa para elevar a una potencia dada los elementos de la matriz
 */
public class PotenciaMatriz {
    public static void main(String[] args) {
        int numeros [][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        }; // dimension de la matriz 3 x 3
        int filas= numeros.length;
        int cols=numeros[0].length;
        int mat_potencia[][]=new int[filas][cols];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la potencia: ");
        int potencia= teclado.nextInt();
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
               mat_potencia[fila][col]= (int) Math.pow(numeros[fila][col], potencia);
            }
        }
        //Lectura de la matriz mat_potencia
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(mat_potencia[fila][col] + "\t");
            }
            System.out.print("\n");
        }
    }
}
