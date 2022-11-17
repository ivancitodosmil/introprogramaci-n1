package condicional_tarea;

import java.util.Scanner;

public class Presion_ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Programa Para Calcular La Presión En Libras Por Pulgada");

        System.out.println("Ingresar el tiempo");
        Scanner teclado = new Scanner(System.in);
        double tiempo = teclado.nextDouble();


        double presion_menor_igual_35 = (0.46 * tiempo);

        double presion_mayor_35 = (0.19*tiempo)+9.45;

        if (tiempo <=35)
            System.out.println("La presión en libras por pulgada cuadrada es: " + presion_menor_igual_35 );


        else if (tiempo>35)
            System.out.println("La presión en libras por pulgada cuadrada es: " + presion_mayor_35 );


    }
}
