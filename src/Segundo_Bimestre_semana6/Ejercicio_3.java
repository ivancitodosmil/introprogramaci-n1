package Segundo_Bimestre_semana6;

import java.util.Scanner;

public class Ejercicio_3 {

    /**
     * Método para ingresar los Números de Cédula
     */
    public static void ingresar_cedula(){
        Scanner teclado = new Scanner(System.in);
        int matriz [][]=new int[5][10];
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.println("Ingrese el numero de cedula"+(fila+1));
            for (int col = 0; col < matriz[0].length; col++) {
                matriz[fila][col] = teclado.nextInt();
            }
        }
        modificar_pares_impares(matriz); //Método anidado, para que de está forma se pueda leer el valor de la matriz ingresada
                                         // que contiene los números de cédulas.
    }

    /**
     * Método para realizar los pasos para determinar si un número de cédula es correcto o no
     * @param matriz_cedula
     */
    public static void modificar_pares_impares(int[][] matriz_cedula){
        for (int fila = 0; fila < matriz_cedula.length; fila++) {
            for (int col = 0; col < matriz_cedula[0].length-1; col=col+2) {
                matriz_cedula[fila][col]=matriz_cedula[fila][col]*2;
            }
        }
        for (int fila = 0; fila < matriz_cedula.length; fila++) {
            for (int col= 0; col < 9; col++) {
                if (matriz_cedula[fila][col]>=10){
                    matriz_cedula[fila][col]=matriz_cedula[fila][col]-9;
                }
            }
        }
        int suma_elementos[][]=new int[5][10];
        for (int fila = 0; fila < matriz_cedula.length; fila++) {
            int acumulador=0;
            for (int col = 0; col < matriz_cedula[0].length-1; col++) {
                acumulador= acumulador+matriz_cedula[fila][col];
            }
            suma_elementos[fila][0]=acumulador;
        }
        int definir_decena[][]=new int[5][10];
        for (int fila = 0; fila < matriz_cedula.length; fila++) {
            while (suma_elementos[fila][0]<99 || suma_elementos[fila][0]<1000){
                definir_decena[fila][0]=suma_elementos[fila][0]/10;
                break;
            }
        }
        for (int fila = 0; fila < matriz_cedula.length; fila++) {
            definir_decena[fila][0]=(definir_decena[fila][0]*10)+10;
        }
        for (int fila = 0; fila < matriz_cedula.length; fila++) {
            definir_decena[fila][0]=definir_decena[fila][0]-suma_elementos[fila][0];
        }
        for (int fila = 0; fila < matriz_cedula.length; fila++) {
            if (definir_decena[fila][0]==matriz_cedula[fila][9]){
                System.out.println("El Número de Cédula "+(fila+1)+" es Correcto");
            }else {
                System.out.println("El Número de Cédula "+(fila+1)+" es Incorrecto");
            }
        }
    }
    public static void main(String[] args) {
        ingresar_cedula();
    }
}
