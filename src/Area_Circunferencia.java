package Codificación_Programas;

import java.util.Scanner;

public class Area_Circunferencia {
    public static void main(String[] args) {

        System.out.println("Programa Para Obtener el Área de una Circunferencia");

        System.out.println("Ingrese el valor del radio");

        Scanner teclado = new Scanner(System.in);
        double radio = teclado.nextDouble();
        //Comandos que permiten obtener el valor del radio de la circunferencia desde el teclado.


        int exponente = 2;

        double area = (Math.PI) * (Math.pow(radio, exponente));
        //Aplicamos la fórmula para obtener el área de una circuenferencia.

        System.out.println("El área de la circunferencia es: " +area);
    }
}

