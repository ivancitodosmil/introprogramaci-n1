package segundo_bimestre.semana2;

public class ArregloCuadrado {
    public static void main(String[] args) {
        int numero [] = {2, 3, 5, 7, 9,11, 13};
        int cuadrado_numeros [] = new int [numero.length];
        for (int indice = 0; indice < numero.length; indice++){
            cuadrado_numeros[indice] = (numero[indice]) * (numero[indice]); //Calculamos el cuadrado de cada número
        }
        for (int indice = 0; indice < numero.length; indice++) {
            System.out.println(cuadrado_numeros[indice]);
        }
    }
}
