package Algoritmos_Ordenamiento_Determinar_Tiempo_Tarea;

public class Burbuja_Mejorado {
    public static void main(String[] args) {
        long inicio_tiempo= System.currentTimeMillis();
        boolean cambio;
        int arreglo[]=new int[1000]; //Aquí es donde se va a realizar los cambios para trabajar con 1000 0 100000 para las pruebas
        int indice2=0;
        for (int indice = 1000; indice > 0; indice--) { //Aquí también va a variar el índice (1000 o 100000)
            arreglo[indice2]=indice;
            indice2++;
        }
        for (int indice = 0; indice < arreglo.length-1; indice++) {
            cambio=false;
            for (int elemento = 0; elemento < arreglo.length-indice-1; elemento++) {
                if (arreglo[elemento]>arreglo[elemento+1]) {
                    int aux=arreglo[elemento];
                    arreglo[elemento]=arreglo[elemento+1];
                    arreglo[elemento+1]=aux;
                    cambio=true;
                }
            }
            if (!cambio) {
                break;
            }
        }
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println(arreglo[indice]);
        }
        long fin_tiempo=System.currentTimeMillis();
        double tiempo= (fin_tiempo-inicio_tiempo);
        System.out.println(tiempo + " milisegundos");//El tiempo que tarda el algoritmo burbuja mejorado en ordenar los datos
    }
}
