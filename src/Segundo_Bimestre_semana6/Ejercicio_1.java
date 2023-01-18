package Segundo_Bimestre_semana6;

import java.util.Scanner;

/**
 * Simular todas las funciones de un cajero automático
 */
public class Ejercicio_1 {
    static double saldo_cuenta;

    /**
     * Método para Consultar el Saldo de la Cuenta. Método Sin Retorno
     */
    public static void consultar_saldo() {
        System.out.println("Saldo actual: " + saldo_cuenta);
    }

    /**
     * Método para Retirar Dinero. Método Con Retorno
     * @param retiro
     * @return
     */
    public static boolean retirar_saldo(int retiro) {
        if (retiro <= saldo_cuenta && retiro > 0) {
            saldo_cuenta = saldo_cuenta - retiro;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método para Depositar Dinero. Método con retorno
     * @param deposito
     * @return
     */
    public static double depositar_saldo(int deposito) {
        saldo_cuenta = saldo_cuenta + deposito;
        return saldo_cuenta;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la Cantidad de Dinero que Posee en su Cuenta");
        saldo_cuenta = teclado.nextDouble();

        boolean interruptor = true;
        while (interruptor) {
            System.out.println("Selecciona una Opción");
            System.out.println("Opción 1: Consultar Saldo");
            System.out.println("Opción2: Retirar Saldo");
            System.out.println("Opción 3: Depositar Saldo");
            System.out.println("Opción 4: Salir");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    consultar_saldo();
                    break;
                case 2:
                    System.out.print(" Ingrese la cantidad de dinero que desea retirar ");
                    int retiro = teclado.nextInt();
                    if (retirar_saldo(retiro)) {
                        System.out.println("Su Retiro ha sido Realizado");
                    } else {
                        System.out.println("Sin Fondos Suficientes o ha Colocado una Cantidad Errónea");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la Cantidad de Dinero que desea Depositar ");
                    int deposito = teclado.nextInt();
                    depositar_saldo(deposito);
                    break;
                case 4:
                    interruptor = false;
                    System.out.println("Hasta Pronto");
                    break;
                default:
                    System.out.println("Opción Inválida");
                    break;
            }
        }
    }
}
