package Proyecto_Final;
// Ej  1:  Realice  un  programa  que  solicite  una fecha  de  nacimiento  (años,  meses  y  días)  y en base
// a la fecha y hora actual, realizar el cálculo  de  la  edad  en:  años,  meses,  días, horas.
// Tener en cuenta años bisiestos.

import com.sun.source.tree.WhileLoopTree;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejercicio1_Calculo_de_Edad {
    public static void main(String[] args) {
        System.out.println("Cálculo De Su Edad Actual");

        System.out.println("Ingrese su año de Nacimiento");
        Scanner teclado = new Scanner(System.in);
        int año = teclado.nextInt();

        System.out.println("Ingrese en números el mes de su Nacimiento");
        int mes = teclado.nextInt();

        System.out.println("Ingrese el día de su Nacimiento");
        int dia = teclado.nextInt();


        Calendar fecha = new GregorianCalendar();
        int año_actual = fecha. get(Calendar. YEAR);
        int mes_actual = fecha. get(Calendar. MONTH);
        int dia_actual = fecha. get(Calendar. DAY_OF_MONTH);
        int hora_actual = fecha. get(Calendar. HOUR_OF_DAY);


        int años = año_actual- año;
        int meses = mes_actual - mes;
        int dias = dia_actual - dia;
        int dias_menor_cero= dia_actual;

        if (meses < 0 && dias>0){
            años=años-1;
            meses= 12-(mes-mes_actual);

           System.out.println("Su edad es:  "+años +" años "+meses+ " meses " +dias+ " dias " +hora_actual+ " horas " );

        } else if (meses <0 && dias<0) {
            años=años-1;
            meses= (12-(mes-mes_actual))-1;

            System.out.println("Su edad es:  "+años +" años "+meses+ " meses " +dias_menor_cero+ " dias " +hora_actual+ " horas " );

        } else if (meses>0 && dias < 0){
            meses = meses-1;

            System.out.println(" Su edad es: " +años+ " años " +meses+ " meses " +dias_menor_cero+ " dias " +hora_actual+ " horas ");


        } else if ((dia >= 1 && dia <=31) && (mes==1 || mes ==3 || mes== 5 || mes==7 || mes == 8 || mes == 10 || mes==12) &&
                (año >= 0 && año <= 2022)){

            System.out.println("Su edad es:  "+años +" años "+meses+ " meses " +dias+ " dias " +hora_actual+ " horas " );


        }else if ((dia >= 1 && dia <=30) && (mes==4 || mes ==6 || mes== 9  || mes == 11) && (año >= 0 &&  año <= 2010)){

            System.out.println("Su edad es:  "+años +" años "+meses+ " meses " +dias+ " dias " +hora_actual+ " horas " );


        }else if ((dia >= 1 && dia <=28) && (mes==2) && (año >= 0 &&  año <= 2022)){

            System.out.println("Su edad es:  "+años +" años "+meses+ " meses " +dias+ " dias " +hora_actual+ " horas " );


        }else if ((dia >= 1 && dia <=29) && (mes==2) && (año >= 0 &&  año <= 2022) && (año%4==0)){

            System.out.println("Su edad es:  "+años +" años "+meses+ " meses " +dias+ " dias " +hora_actual+ " horas " );

        } else

            System.out.println("Introduzca una fecha de Nacimiento correcta");



    }
}


































