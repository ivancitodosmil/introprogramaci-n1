package Trabajo_Extraclase_Arreglos_2Bimestre;

import java.util.Scanner;

public class Numero_Cedula_Correcta {
    public static void main(String[] args) {

        int arreglo [] = new int [10];
        int suma_pares = 0;
        int suma_impares = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su número de cédula");
        for (int indice = 0; indice < 10; indice++) {
            arreglo[indice] = teclado.nextInt();
        }
        for (int indice = 1; indice < 8; indice= indice + 2) {  // Sumamos las posiciones pares.
            suma_pares = suma_pares + arreglo[indice];
        }
        for (int indice = 0; indice < 9; indice= indice + 2) {  // A los posiciones impares se las multiplica por 2.
            int resultado_mult = arreglo[indice] * 2;
            if(resultado_mult > 9) {                        // Si la multiplicación es mayor que 9, a ese resultado se le resta nueve.
                resultado_mult = resultado_mult - 9;
            }
            suma_impares = suma_impares + resultado_mult; // Sumamos las posiciones impares
        }
        int suma_multiplicacion = suma_pares + suma_impares;   // Sumamos pares e impares
        int ultimo_digito = 10 - (suma_multiplicacion % 10);

        if (ultimo_digito == arreglo[9] ){              // Proceso de verificación
            System.out.println("La Cédula ingresada es correcta");

        } else {
            System.out.println("La Cédula ingresada es incorrecta");
        }
    }
}
