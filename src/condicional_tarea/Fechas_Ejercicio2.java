package condicional_tarea;

import java.util.Scanner;

public class Fechas_Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Programa Para Determinar Si Una Fecha Es Correcta o Incorrecta");

        System.out.println("Ingrese el día");
        Scanner teclado = new Scanner (System.in);
        int dia = teclado.nextInt();

        System.out.println("Ingrese el mes");
        int mes = teclado.nextInt();

        System.out.println("Ingrese el año");
        int año = teclado.nextInt();



        if ((dia >= 1 && dia <=31) && (mes==1 || mes ==3 || mes== 5 || mes==7 || mes == 8 || mes == 10 || mes==12) &&
                (año >= 1990 && año <= 2010))
            System.out.println("Fecha correcta");

        else if
        ((dia >= 1 && dia <=30) && (mes==4 || mes ==6 || mes== 9  || mes == 11) && (año >= 1990 &&  año <= 2010))
            System.out.println("Fecha correcta");


        else if ((dia >= 1 && dia <=28) && (mes==2) && (año >= 1990 &&  año <= 2010))
            System.out.println("Fecha correcta");


        else if ((dia >= 1 && dia <=29) && (mes==2) && (año >= 1990 &&  año <= 2010) && (año%4==0))
            System.out.println("Fecha correcta");


        else
            System.out.println("Fecha incorrecta");

    }
}

