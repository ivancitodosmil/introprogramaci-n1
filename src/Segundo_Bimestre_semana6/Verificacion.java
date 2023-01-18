package Segundo_Bimestre_semana6;

import java.util.Scanner;

/**
 * Programa para verificar a través de métodos si un número es primo o no
 * y si es par o impar
 */
public class Verificacion {
    int num_a_verificar;
    public boolean vereficar_primo(int num_a_verificar){
        int contador_divisores = 0;
        for (int contador = 1; contador <= num_a_verificar ; contador++) {
            if (num_a_verificar % contador == 0)//Detectamos un nuevo divisor
                contador_divisores++;
        }
        if (contador_divisores == 2)//verificamos si es primo
            return true;
        else
            return false;
    }
    public boolean verificar_par_impar (int num_a_verificar){
        if (num_a_verificar%2==0)
            return true;
        else
            return false;

    }
    public void ejecutar(){
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        while(interruptor){
            System.out.println("Digite 0 para Salir");
            System.out.println("Digite 1 para saber si un número es Primo ");
            System.out.println("Digite 2 para saber si un número es Par o Impar: ");
            int opcion = teclado.nextInt();

            switch (opcion){
                case 0:
                    interruptor = false;
                    System.out.println("SALIR");
                    break;
                case 1:
                    ingresar_numero();
                    if (vereficar_primo(num_a_verificar)==true)
                        System.out.println("Es un número Primo");
                    else
                        System.out.println("No es un número Primo");
                    break;
                case 2:
                    ingresar_numero();
                    if (verificar_par_impar(num_a_verificar)==true)
                        System.out.println("Es un número Par");
                    else
                        System.out.println("No es un número Par");
                    break;

                default:
                    System.out.println("Ingrese Una Opción Inválida");
            }
        }
    }
    public void ingresar_numero(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número que desea verificar");
        num_a_verificar = teclado.nextInt();
    }
    public static void main(String[] args) {
        Verificacion mivariable = new Verificacion();
        mivariable.ejecutar();
    }
}
