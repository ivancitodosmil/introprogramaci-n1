/**
 * Programa para determinar si encontramos el área de un triángulo, círculo y cuadrado
 */

import java.util.Scanner;

public class SwitchArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un número del 1 al 3");
        int opcion = teclado.nextInt();

        switch (opcion){

            case 1:
                System.out.println("Encontraremos el área de un triángulo");

                System.out.println("Ingresar la base");
                double base = teclado.nextDouble();
                System.out.println("Ingresar la altura");
                double altura = teclado.nextDouble();
                double area_triangulo = (base*altura)/2;
                System.out.println("El área de un triángulo es: "+area_triangulo);
                break;

            case 2:
                System.out.println("Encontraremos el área de un círculo");

                System.out.println("Ingrese el valor del radio");
                double radio = teclado.nextDouble();
                double area_circulo = (Math.PI*radio*radio);
                System.out.println("El área de la circunferencia es: "+area_circulo);
                break;

            case 3:
                System.out.println("Encontraremos el área de un cuadrado");

                System.out.println("Ingrese el valor de un lado");
                double lado = teclado.nextDouble();
                double area_cuadrado= (lado*lado);
                System.out.println("El área de la circunferencia es: "+area_cuadrado);
                break;

            default:
                System.out.println("Opción incorrecta");


        }

    }

}

