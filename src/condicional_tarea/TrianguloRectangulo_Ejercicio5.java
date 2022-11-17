package condicional_tarea;

import java.util.Scanner;

public class TrianguloRectangulo_Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Programa Para Determinar Si Las Medidas De Tres Lados Pueden Ser De Un Triángulo Rectángulo");

        System.out.println("Ingresar el valor del cateto 1");
        Scanner teclado = new Scanner(System.in);
        int cateto1 = teclado.nextInt();

        System.out.println("Ingresar el valor del cateto 2");
        int cateto2 = teclado.nextInt();

        System.out.println("Ingresar el valor de la hipotenusa");
        int hipotenusa = teclado.nextInt();

        int suma_catetos_al_cuadrado = (cateto1*cateto1)+(cateto2*cateto2);
        int hipotenusa_al_cuadrado = (hipotenusa*hipotenusa);

        if (suma_catetos_al_cuadrado == hipotenusa_al_cuadrado)
            System.out.println("Son las medidas de un Triángulo Rectángulo");
        else
            System.out.println("No son las medidas de un Triángulo Rectángulo");
    }
}
