package Segundo_Bimestre_semana6;

import java.util.Scanner;

/**
 * Programa para crear métodos para realizar operaciones matemáticas
 */

public class OperacionAritmetica {
    //Creación de variables globales
    int n1;
    int n2;

    /**
     * Método para realizar la suma de dos números enteros
     * @param n1
     * @param n2
     * @return
     */
    public int sumar (int n1, int n2) {
        return (n1+n2);

    }

    /**
     * Método para realizar la resta de dos números enteros
     * @param n1
     * @param n2
     * @return
     */
    public int restar (int n1, int n2){
        return (n1-n2);
    }

    /**
     * Método para multiplicar dos números enteros. No retorna valor
     * @param n1
     * @param n2
     */
    public void multiplicar (int n1, int n2){
        System.out.println("La múltiplicación es: " + (n1*n2));
    }

    /**
     * Método para dividir nos números enteros
     */
    public void dividir (){
        if (n2 > 0){
            System.out.println("La división es: "+((double)n1/(double)n2));
        } else{
        System.out.println("División por cero no existe");
        }
    }
    public void ejecutar (){
        Scanner teclado = new Scanner(System.in);
        boolean interruptor = true;
        while (interruptor){
            System.out.println("Digite 0, para salir");
            System.out.println("Digite 1, para sumar dos números");
            System.out.println("Digite 2, para restar dos números");
            System.out.println("Digite 3, para multiplicar dos números");
            System.out.println("Digite 4, para dividir dos números");
            int opcion = teclado.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("SALIR");
                    interruptor=false;
                    break;
                case 1:
                    ingresar_numeros();
                    System.out.println("La suma es: "+sumar(n1,n2));
                    break;
                case 2:
                    ingresar_numeros();
                    System.out.println("La resta es: "+restar(n1,n2));
                    break;
                case 3:
                    ingresar_numeros();
                    multiplicar (n1, n2);
                    break;
                case 4:
                    ingresar_numeros();
                    dividir();
                    break;
                default:
                    System.out.println("OPCIÓN INVÁLIDA");
            }

            }
        }
    public void ingresar_numeros(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresar el número 1: ");
        int n1= teclado.nextInt();
        System.out.println("Ingresar el número 2: ");
        int n2 = teclado.nextInt();
    }
    public static void main(String[] args) {
        OperacionAritmetica mivariable = new OperacionAritmetica();
        mivariable.ejecutar();
    }
}
