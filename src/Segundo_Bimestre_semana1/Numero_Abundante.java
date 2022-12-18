package Segundo_Bimestre_semana1;

import java.util.Scanner;

public class Numero_Abundante {
    public static void main(String[] args) {

        System.out.println("Determinar si un Número es Abundante o No");

        System.out.println("Ingrese un número");
        Scanner teclado = new Scanner (System.in);
        int numero = teclado.nextInt();

        int contador = 1;
        int suma_divisores=1;

        while (contador<numero){
            if (numero%contador==0)
                suma_divisores=suma_divisores+contador;
            contador=contador+1;
        }

        if (suma_divisores>numero)
            System.out.println("El número es abundante");
        else
            System.out.println("No es un número abundante");
    }
}
