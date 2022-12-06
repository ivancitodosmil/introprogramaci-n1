package bimestre2_semana1;
import java.util.Scanner;

public class Trabajo_Grupal {
    public static void main(String[] args) {

        int interruptor = 1;
        System.out.println("Elija una opción");
        System.out.println("OP 1: Convertir un valor de MB a KB");
        System.out.println("OP 2: Convertir un valor de KB a MB");
        System.out.println("OP 3: Convertir un valor en MB a bits");
        System.out.println("OP 4: Salir");

        Scanner teclado = new Scanner(System.in);
        int OP = teclado.nextInt();

        while (interruptor==1)

            switch (OP){
                case 1:
                    System.out.println("Opción de MB a KB");
                    System.out.println("Ingrese el valor de MB");
                    int MB = teclado.nextInt();
                    int KB = MB*1024;
                    System.out.println("El valor en KB es: "+KB);
                    break;

                case 2:
                    System.out.println("Opción de KB a MB");
                    System.out.println("Ingrese el valor de KB");
                     KB = teclado.nextInt();
                     MB = KB/1024;
                    System.out.println("El valor en MB es: "+MB);
                    break;

                case 3:
                    System.out.println("Opción de MB a bits");
                    System.out.println("Ingrese el valor de MB");
                    MB = teclado.nextInt();
                    int bits = MB*8000000;
                    System.out.println("El valor en bits es: "+bits);
                    break;

                case 4:
                    System.out.println("Saliendo del programa");
                    interruptor=0;
                    break;

                default:
                    System.out.println("Opción Incorrecta");
                    interruptor=0;
                    break;
            }
        }
    }
