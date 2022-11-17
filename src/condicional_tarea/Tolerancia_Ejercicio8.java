package condicional_tarea;

import java.util.Scanner;

public class Tolerancia_Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Programa Para Recibir La Tolerancia De Un Componente Y Determinar La Especificación");

        System.out.println("Ingrese el valor de tolerancia de un componente");


        Scanner teclado = new Scanner(System.in);
        double tolerancia = teclado.nextDouble();


        if (tolerancia < 0.1)
            System.out.println("La especificación es Exploración Espacial");

        else if ((tolerancia >= 0.1) && (tolerancia<1))
            System.out.println("La especificación es Grado militar");

        else if ((tolerancia >= 1) && (tolerancia<10))
            System.out.println("La especificación es Grado Comercial");

        else if (tolerancia>=10)
            System.out.println("La especificación es Grado de Juguete");

    }
}
