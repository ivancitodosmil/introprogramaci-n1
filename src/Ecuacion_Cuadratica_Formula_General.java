import java.util.Scanner;

public class Ecuacion_Cuadratica_Formula_General {

        public static void main(String[] args) {
            System.out.println(" Obtener Las Respuestas De Una Ecuación Cuadrática Por Fórmula General");

            System.out.println("Ingresar el valor de a");
            Scanner teclado = new Scanner (System.in);
            double a = teclado.nextDouble();
            System.out.println("Ingresar el valor de b");
            double b = teclado.nextDouble();
            System.out.println("Ingresar el valor de c");
            double c = teclado.nextDouble();

            double determinante = Math.pow(b,2)-(4*a*c);

            if (determinante>=0) {
                double x1 = ((-b + Math.sqrt(determinante))/(2*a));
                double x2 = ((-b - Math.sqrt(determinante))/(2*a));

                System.out.println("La primera respuesta es: x1="+x1);
                System.out.println("La segunda respuesta es: x2="+x2);
            }else{
                //Comandos que nos permiten obtener las respuestas cuando la discriminante es mayor o igual a 0



                if (determinante<0) {

                    System.out.println("La ecuación no puede ser resuelta / No hay solución");

                }else{
                    // Cuando la discriminante sea menor a 0 no podremos obtener una solución
                }
            }
        }





}
