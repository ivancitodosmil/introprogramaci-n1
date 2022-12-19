package Trabajo_Extraclase_Arreglos_2Bimestre;

import java.util.Scanner;

public class Binario_A_Decimal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Tamaño del número binario a ingresar");
        int tamaño = entrada.nextInt();

        int base = 2;
        double exponente = -1;
        double num_decimal=0;
        int num_binario=0;


        int arreglo [] = new int[tamaño];
        System.out.println("Ingrese el número binario");
        for (int indice = 0; indice < tamaño; indice++) {
             num_binario = entrada.nextInt();
            arreglo[indice] = num_binario;
            if (num_binario != 0 && num_binario != 1) {
                System.out.println("El número ingresado no es binario");
            }
        }

        for (int indice=tamaño-1; indice>=0; indice--) {

            exponente=exponente+1;
            double potencia = Math.pow(base, exponente);
            double multiplicacion = arreglo[indice] * potencia;

            num_decimal =  num_decimal+multiplicacion;
        }
        System.out.println(num_decimal);

        }
    }


