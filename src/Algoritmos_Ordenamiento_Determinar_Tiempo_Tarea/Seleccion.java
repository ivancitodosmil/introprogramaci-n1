package Algoritmos_Ordenamiento_Determinar_Tiempo_Tarea;

public class Seleccion {
    public static void main(String[] args) {
        long inicio_tiempo= System.currentTimeMillis();
        int arreglo[]=new int[1000]; //Aquí es donde se va a realizar los cambios para trabajar con 1000 0 100000 para las pruebas
        int indice2=0;
        for (int indice = 1000; indice > 0; indice--) { //Aquí también va a variar el índice (1000 o 100000)
            arreglo[indice2]=indice;
            indice2++;
        }
        for (int indice = 0; indice < arreglo.length; indice++) {
            int min=indice;
            for (int elemento = indice+1; elemento < arreglo.length; elemento++) {
                if(arreglo[elemento]<arreglo[min]){
                    min=elemento;
                }
            }
            int aux = arreglo[indice];
            arreglo[indice]=arreglo[min];
            arreglo[min]=aux;
        }
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println(arreglo[indice]);
        }
        long fin_tiempo=System.currentTimeMillis();
        double tiempo= (fin_tiempo-inicio_tiempo);
        System.out.println(tiempo + " milisegundos");//El tiempo que tarda el algoritmo Selección en ordenar los datos
    }
}
