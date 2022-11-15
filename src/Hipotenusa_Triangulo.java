import java.util.Scanner;

public class Hipotenusa_Triangulo {

        public static void main(String[] args) {

            System.out.println("Programa Para Obtener El Valor De La Hipotenusa De Un Triángulo Rectángulo");

            System.out.println("Ingrese el valor del cateto 1");
            Scanner teclado = new Scanner(System.in);
            double cateto_1 = teclado.nextDouble();
            // Comandos que nos permiten obtener el valor del cateto 1 desde el teclado.


            System.out.println(" Ingrese el valor del cateto 2");
            double cateto_2 = teclado.nextDouble();
            // Comandos que nos permiten obtener el valor del cateto 2 desde el teclado.


            int exponente = 2;

            double hipotenusa =  Math.sqrt (Math.pow(cateto_1,exponente) + Math.pow(cateto_2, exponente));
            //Aplicamos la fórmula del teorema de pitágoras para obtener la hipotenusa.


            System.out.println("El valor de la hipotenusa es: " +hipotenusa);
}
}