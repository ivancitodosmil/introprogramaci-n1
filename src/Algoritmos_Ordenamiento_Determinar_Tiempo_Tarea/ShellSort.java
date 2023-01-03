package Algoritmos_Ordenamiento_Determinar_Tiempo_Tarea;

public class ShellSort {
    public static void main(String[] args) throws InterruptedException {
        long inicio_tiempo= System.currentTimeMillis();
        int arreglo[]=new int[1000]; //Aquí es donde se va a realizar los cambios para trabajar con 1000 0 100000 para las pruebas
        int indice2=0;
        for (int indice = 1000; indice > 0; indice--) { //Aquí también va a variar el índice (1000 o 100000)
            arreglo[indice2]=indice;
            indice2++;
        }
        for (int salto = arreglo.length/2; salto!=0; salto/=2) {
            boolean cambios = true;
            while (cambios) {
                cambios = false;
                for (int indice = salto; indice < arreglo.length; indice++)
                {
                    if (arreglo[indice - salto] > arreglo[indice]) {
                        int aux = arreglo[indice];
                        arreglo[indice] = arreglo[indice - salto];
                        arreglo[indice - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        for (int indice = 0; indice < arreglo.length; indice++) {
            System.out.println(arreglo[indice]);
        }
        long fin_tiempo=System.currentTimeMillis();
        double tiempo= (fin_tiempo-inicio_tiempo);
        System.out.println(tiempo + " milisegundos");//El tiempo que tarda el algoritmo ShellSort en ordenar los datos
    }
}
