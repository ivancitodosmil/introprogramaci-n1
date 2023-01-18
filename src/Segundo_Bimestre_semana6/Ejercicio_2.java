package Segundo_Bimestre_semana6;

import java.util.Scanner;

/**
 * Utilizar la definición del Teorema de Pitágoras para determinar de que tipo es un Triángulo
 */
public class Ejercicio_2 {
    double hipotenusa;
    double catetos;

    /**
     * Método para adaptar los catetos y la hipotenusa a la fórmula de pitágoras
     * @param cateto_a
     * @param cateto_b
     */
    public void ajustar_pitagoras (double cateto_a, double cateto_b){
        catetos=Math.pow(cateto_a,2) + Math.pow(cateto_b,2);
        hipotenusa=Math.pow(hipotenusa,2);
    }

    /**
     * Método para determinar que tipo de es el triángulo
     */
    public void determinar_triangulo(){
        if (hipotenusa == catetos){
            System.out.println("Es un Triángulo Rectángulo");
        }else if(hipotenusa<catetos){
            System.out.println("Es un Triángulo Acutángulo");
        } else if (hipotenusa>catetos) {
            System.out.println("Es un Triángulo Obtusángulo");
        }
    }

    /**
     * Método para pedir los valores de los catetos y la hipotenusa por teclado
     * Método el cual vamos a ejecutar en main
     */
    public void ejecutar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer cateto");
        double cateto_1 = teclado.nextDouble();
        System.out.println("Ingrese el valor del segundo cateto");
        double cateto_2 = teclado.nextDouble();
        System.out.println("Ingrese la hipotenusa");
        hipotenusa = teclado.nextDouble();
        ajustar_pitagoras (cateto_1, cateto_2);
        determinar_triangulo();
    }
    public static void main(String[] args) {
        Ejercicio_2 mivalor = new Ejercicio_2();
        mivalor.ejecutar();
    }
}
