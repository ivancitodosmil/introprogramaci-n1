package condicional_tarea;

import java.util.Scanner;

public class NumeroMayor_Ejercicio7 {

    public static void main(String[] args) {
        System.out.println("Programa Para Determinar El Número Mayor ");

        System.out.println("Ingresar el número 1");
        Scanner teclado = new Scanner(System.in);
        int numero1 = teclado.nextInt();

        System.out.println("Ingresar el número 2");
        int numero2 = teclado.nextInt();

        if (numero1>numero2)
            System.out.println("El número mayor es el número 1");

        else if (numero2>numero1)
            System.out.println("El número mayor es el número 2");

        else
            System.out.println("Los números son iguales");


    }
}
