package Proyecto_Final;
// Ejercicio  2: Realizar un programa que genere y grafique con  asteriscos  la  serie  fibonacci. Se  debe
//recibir un número por teclado que indicará el total de números generados para la serie.
//Ejemplo:  6  ->  (se  generarán  los  6  primeros números de la serie)


import javax.swing.*;
import java.util.Scanner;

public class Ejercicio2_SerieFibonacci_Asteriscos {
    public static void main(String[] args) {



        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese un número el cual va a controlar las repeticiones");
        int numero= teclado.nextInt();


        String A="";
        String B="*";
        String C="*";


        for (int contador = 1; contador <= numero; contador++) {

                  System.out.println(C);

            C=A+B;

            A=B;

            B=C;

        }
    }
}
