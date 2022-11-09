import java.util.Scanner;

public class Decision {
    public static void main(String[] args) {
        System.out.println("Programa para determinar si una persona es mayor de edad");
        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese su edad: ");


        int edad = entrada.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
            System.out.println("Porfa ya cambia. Eres viejo");
        }else{
            System.out.println("Eres menor de edad");
            System.out.println("Te falta madurar");
            System.out.println("Prohibido el ingreso");


        }
    }
}

