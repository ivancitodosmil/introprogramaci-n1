package segundo_bimestre.semana2;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese una palabra para determinar si es palíndromo");
        String palabra = entrada.nextLine();
        palabra=palabra.toLowerCase();
        int tam_palabra = palabra.length();
        System.out.println("tam_palabra= "+tam_palabra);

        char palabra_arr [] = new char[tam_palabra];
        //pasamos los caracteres de palbra al arreglo palabra_arr
        for (int indice = 0; indice < tam_palabra; indice++) {
            palabra_arr[indice]=palabra.charAt(indice);
        }

         //Lectura del arreglo de derecha a izquierda
          String palabra_invertida = "";

        for (int indice = tam_palabra-1; indice >= 0; indice --) {
            palabra_invertida=palabra_invertida + palabra_arr [indice];

        }
        // determinamos si es palindromo o no

        if (palabra.equals(palabra_invertida)) {
            System.out.println("SI es palabra palíndroma");

        } else
            System.out.println("No es palabra palíndroma");
}
}