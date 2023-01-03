package Algoritmos_Ordenamiento_Determinar_Tiempo_Tarea;
public class Burbuja {
    public static void main(String[] args) {
        long inicio_tiempo = System.currentTimeMillis();
        int numeros [] = new int [1000]; //Aquí es donde se va a realizar los cambios para trabajar con 1000 0 100000 para las pruebas
        int indice2=0;
        for (int indice = 1000; indice>0 ; indice--, indice2++) {  //Aquí también va a variar el índice (1000 o 100000)
            numeros[indice2]=indice;
        }
        for (int indice = 1; indice <= numeros.length-1 ; indice++) {
            for (int elemento = 0; elemento<= numeros.length-2; elemento++) {
                if (numeros[elemento]>numeros[elemento+1]){
                    int aux = numeros [elemento];
                    numeros[elemento]=numeros[elemento+1];
                    numeros [elemento+1]=aux;
                }
            }
        }
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]);
        }
        long fin_tiempo=System.currentTimeMillis();
        double tiempo= (fin_tiempo-inicio_tiempo);
        System.out.println(tiempo + " milisegundos"); //El tiempo que tarda el algoritmo burbuja en ordenar los datos en milisegundos
    }
}



