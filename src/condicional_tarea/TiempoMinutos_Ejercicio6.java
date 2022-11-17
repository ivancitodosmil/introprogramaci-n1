package condicional_tarea;

import java.util.Scanner;

public class TiempoMinutos_Ejercicio6 {

    public static void main(String[] args) {
        System.out.println("Programa Para Determinar Dado Un Tiempo En Minutos, Los Días, Horas Y Minutos Correspondientes");

        System.out.println("Ingrese el valor del tiempo en minutos");
        Scanner teclado = new Scanner(System.in);
        int tiempo = teclado.nextInt();

        int dias = (tiempo/1440);
        int horas = (tiempo/60);

        if (tiempo > 0){

            System.out.println("El tiempo en días es: " + dias);
            System.out.println("El tiempo en horas es: " + horas);
            System.out.println("El tiempo en minutos es: " + tiempo);
        }else
            System.out.println("Los valores negativos en el tiempo se rechazan al carecer de sentido físico");
    }
}
