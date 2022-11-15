package repeticion_while;


import javax.swing.JOptionPane;

/**
 * Generar la tabla de multiplicar hasta el 10 de un número ingresado por teclado
 */
public class TablaMultiplicación {
    public static void main(String[] args) {
        //System.out.println("Programa para generar la tabla de MULTIPLICAR");
        JOptionPane.showMessageDialog(null, "Programa para generar la tabla de MULTIPLICAR");
        // System.out.println("Ingresar un número");


        String num = JOptionPane.showInputDialog("Ingresar un número");
        int contador = 0;
        String acumulador = "";

        while (contador <=10) {

            int mult =  Integer.parseInt(num) *contador;//convertimos un valor de tipo string a entero
            String salida = num + " x " + String.valueOf(contador) + "=" + String.valueOf(mult)+"\n";
            acumulador = acumulador + salida;
            contador=contador + 1;
    }
        JOptionPane.showMessageDialog (null, acumulador);
}
}
