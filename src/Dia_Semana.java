import java.util.Scanner;

public class Dia_Semana {
    public static void main(String[] args) {
        System.out.println("Programa para identificar Dias de la semana");

        Scanner teclado = new Scanner (System.in);


        int numero_dias_semana = teclado.nextInt();

        if (numero_dias_semana == 1 )
            System.out.println("Lunes");
        else if (numero_dias_semana == 2 )
            System.out.println("Martes");
        else if (numero_dias_semana == 3 )
            System.out.println("Miercoles");
        else if (numero_dias_semana == 4 )
            System.out.println("Jueves");
        else if (numero_dias_semana == 5 )
            System.out.println("Viernes");
        else if (numero_dias_semana == 6 )
            System.out.println("Sabado");
        else if (numero_dias_semana == 7 )
            System.out.println("Domingo");
        else
            System.out.println("Error despierta la semana tiene 7 dias ");

    }
}