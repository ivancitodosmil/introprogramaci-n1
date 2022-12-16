package segundo_bimestre.semana2;

import java.util.Scanner;

public class ArregloSuma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese los números que desea por cada arreglo");
        int numeros = teclado.nextInt();
        int arreglo1[] = new int [numeros];
        int arreglo2[] = new int [numeros];

        System.out.println("Ingrese los números para el arreglo 1");
        for (int indice = 0; indice < numeros ; indice++) {
            int numeros1 = teclado.nextInt();
            arreglo1 [indice] = numeros1;

        }
        System.out.println("Ingrese los números para el arreglo 2");
        for (int indice = 0; indice < numeros; indice++) {
            int numeros2 = teclado.nextInt();
            arreglo2[indice]=numeros2;

       }
        int sumatotal[]= new int [numeros];
        for (int indice = 0; indice < numeros ; indice++) {
            sumatotal[indice]= arreglo1[indice] + arreglo2[indice];

        }
        for (int indice = 0; indice < numeros ; indice++) {
            System.out.println(sumatotal[indice]);
        }
    }
}

