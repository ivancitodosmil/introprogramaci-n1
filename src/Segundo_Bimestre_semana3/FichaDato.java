package Segundo_Bimestre_semana3;

import java.util.Scanner;

public class FichaDato {
    public static void main(String[] args) {
        boolean interruptor = true;
        Scanner teclado = new Scanner(System.in);
        String nombres[]=new String[100];
        int edad []=new int[100];
        String univ[]=new String[100];
        int indice=0;
        while(interruptor){
            System.out.println("Ingrese Datos Del Estudiante");
            System.out.println("Ingrese su nombre");
            nombres[indice]= teclado.nextLine();
            System.out.println("Ingrese su edad");
            edad[indice]= teclado.nextInt();
            System.out.println("Ingrese su universidad");
            teclado.nextLine();//Prara ller el enter depués de ingresar edad
            univ[indice]= teclado.nextLine();
            indice++;
            System.out.println("Desea ingresar un nuevo estudiante si/no");
            String resp = teclado.nextLine().toLowerCase();//en minúsculas
            if(resp.equals("no"))
                interruptor=false; // finalizamos while
        }
        //Ordenar Por Edad
        for (int indice2 = 1; indice2 < edad.length ; indice2++) {
            for (int elemento = 0; elemento <= edad.length-2; elemento++) {
                //Verificar si realizamos un Intercambio
                if (edad[elemento]>edad[elemento+1]){
                    int aux = edad[elemento];
                    edad[elemento]=edad[elemento+1];
                    edad [elemento+1]=aux;
                    //Proceso intercambio de arreglo en nombres
                    String aux_n=nombres[elemento];
                    nombres[elemento]=nombres [elemento+1];
                    nombres [elemento+1]=aux_n;
                    //Proceso de intercambio en arreglo univ
                    String aux_u=univ[elemento];
                    univ[elemento]=univ[elemento+1];
                    univ[elemento+1]=aux_u;
                }
            }
        }
        //Presentar datos de los estudiantes
        for (int pos = 0; pos < nombres.length; pos++) {
            if (nombres[pos] != null) {
                System.out.println("Nombres: " + nombres[pos]);
                System.out.println("Edad: " + edad[pos]);
                System.out.println("Universidad: " + univ[pos]);
            }
        }
    }
}
