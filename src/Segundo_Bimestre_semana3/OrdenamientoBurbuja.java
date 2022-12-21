package Segundo_Bimestre_semana3;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int numeros [] = {20,10,5,3,2,1};
        //Controlamos el número de pasadas
        for (int indice = 1; indice <= numeros.length-1 ; indice++) {
            for (int elemento = 0; elemento <= numeros.length-2; elemento++) {
                //Verificar si realizamos un Intercambio
                if (numeros[elemento]>numeros[elemento+1]){
                    int aux = numeros [elemento];
                    numeros[elemento]=numeros[elemento+1];
                    numeros [elemento+1]=aux;
                }
            }
        }
        //Mostrar arreglo ordenado
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]);
        }
    }
}
