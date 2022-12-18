package Segundo_Bimestre_semana2;

public class Arreglos2 {
    public static void main(String[] args) {
        //Creación de arreglos sin valores predefinidos
        String universidades []= new String[5];
        System.out.println("arreglo universidades: ");
        for (int indice = 0; indice < universidades.length ; indice++) {
            System.out.println(universidades[indice]+ "\t");
        }
        int notas[]= new int [4];
        System.out.println("arreglo notas: ");
        for (int indice = 0; indice < notas.length; indice++) {
            System.out.println(notas[indice]);
        }
        boolean valores [] = new boolean [10];
        System.out.println("Arreglo valores bboleanos");
        for (int indice = 0; indice < valores.length; indice++) {
            System.out.println(valores[indice]);
        }

        // Creación de un arreglo cuando en un inicio no conocemos su tamaño
        String nombres []; //declaracion de un arreglo llamado nombres
        nombres = new String[10]; // Creación de un arreglo llamado nombres
    }
}
