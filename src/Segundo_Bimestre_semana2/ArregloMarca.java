package Segundo_Bimestre_semana2;

import java.util.Scanner;

/**
 * Programa que solicite el nombre de n marcas de vehículos y las
 * almacene en un arreglo. Finalmente el programa debe mostrar el
 * nombre de las parcas almacenadas en el arreglo.
 */
public class ArregloMarca {
    public static void main(String[] args) {
        String marcas [];
        System.out.println("Cuántas marcas de vehículo va a ingresar");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine();
        marcas = new String [n]; // Creamos el arreglo con n elementos
        //Operación escritura del arreglo
        for (int indice = 0; indice < n ; indice++) {
            System.out.println("Ingrese el nombre de la marca "+(indice+1));
            String marca = teclado.nextLine();
            marcas [indice] = marca.toUpperCase();
        }
        System.out.println("Listas de marcas ingresadas");
        //Operación lectura de un arreglo
        for (int indice = 0; indice < marcas.length ; indice++) {
            System.out.print(marcas[indice]+"\t");
        }
        //Operación Búsqueda
        System.out.println("¿Qué nombre de marca desea ingresar");
        //toUpperCase() es una función que convierte un texto en mayúsculas // toLowerCase convierte las palabras en misnúscula
        String marca_buscadas = teclado.nextLine().toUpperCase();
        System.out.println("marca_buscada: "+marca_buscadas);
        for (int indice = 0; indice < n; indice++) {
            if (marca_buscadas.equals(marcas [indice])) {
                System.out.println("Marca encontrada");
                System.out.println("Se encuentra en el indice: "+indice);
                break;
        }
    }
}
}