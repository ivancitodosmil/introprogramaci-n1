package condicional_tarea;

import java.util.Scanner;

public class Divisor_Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Programa Para Determinar Si Un Número Es Divisor Para Otro");

        System.out.println("Ingresar el número 1");
        Scanner teclado = new Scanner(System.in);
        int numero_1 = teclado.nextInt();

        System.out.println("Ingresar el número 2");
        int numero_2 = teclado.nextInt();

        if (numero_1%numero_2==0)
            System.out.println("El numero 2 es divisor del numero 1");

        else if (numero_2%numero_1==0)
            System.out.println("El numero 1 es divisor del numero 2");
        else
            System.out.println("No son números divisores entre si");
    }
}
