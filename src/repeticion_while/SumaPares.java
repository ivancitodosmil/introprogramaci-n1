package repeticion_while;

import javax.swing.*;

/**
 * Programa para realizar la suma de los números pares que existen del 1 al 100
 */

public class SumaPares {
    public static void main(String[] args) {
        System.out.println("Suma de números pares del 1 al 100");
        int suma_pares = 0;
        int num = 100;
        while (num >= 2) {
            if (num%2==0){
                suma_pares=suma_pares+num;
    }
            num--;//num=num+1;
}

        System.out.println("La suma de los números pares es: "+ suma_pares);

    }
}