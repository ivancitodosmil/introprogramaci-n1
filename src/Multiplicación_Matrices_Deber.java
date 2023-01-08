import java.util.Scanner;
public class Multiplicación_Matrices_Deber {
    public static void main(String[] args) {
       Scanner teclado=new Scanner (System.in);
        System.out.println("Ingrese el número de filas de la primera matriz");
        int filas_matriz_a = teclado.nextInt();
        System.out.println("Ingrese el número de columnas de la primera matriz");
        int cols_matriz_a= teclado.nextInt();
        System.out.println("Ingrese el número de filas de la segunda matriz");
        int filas_matriz_b= teclado.nextInt();
        System.out.println("Ingrese el número de columnas de la segunda matriz");
        int cols_matriz_b= teclado.nextInt();
        int matriz1 [][]= new int[filas_matriz_a][cols_matriz_a];
        int matriz2 [][]= new int[filas_matriz_b][cols_matriz_b];
        int matriz3 [][]= new int [filas_matriz_a][cols_matriz_b];
        if (cols_matriz_a==filas_matriz_b){
            System.out.println("Ingrese los datos de la primera matriz");
            for (int fila = 0; fila < filas_matriz_a ; fila++) {
                for (int col = 0; col < cols_matriz_a; col++) {
                    System.out.println("Ingrese una valor para fila:["+fila+"] columna: ["+col+"]");
                    matriz1[fila][col]= teclado.nextInt();
                }
            }
            System.out.println("Ingrese los datos de la segunda matriz");
            for (int fila = 0; fila < filas_matriz_b ; fila++) {
                for (int col = 0; col < cols_matriz_b; col++) {
                    System.out.println("Ingrese una valor para fila:["+fila+"] columna: ["+col+"]");
                    matriz2[fila][col]= teclado.nextInt();
                }
            }
            //Ahora procederemos a realizar el proceso de Multiplicación
            for (int fila = 0; fila < filas_matriz_a; fila++) {
                for (int col = 0; col < cols_matriz_b; col++) {
                    for (int recorrido = 0; recorrido < cols_matriz_a; recorrido++) {
                        matriz3[fila][col]=matriz3[fila][col]+(matriz1[fila][recorrido]+matriz2[recorrido][col]);
                    }
                }
            }
            //Procederemos a presentar el resultado de la multiplicación
            System.out.println("El resultado de la multiplicación de las dos matrices es: ");
            for (int fila = 0; fila < matriz3.length; fila++) {
                for (int col = 0; col < matriz3[0].length; col++) {
                    System.out.print(matriz3[fila][col] + "\t");
                }
                System.out.println();
            }
        }
    }
}
