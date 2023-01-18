package Segundo_Bimestre_semana6;

import java.util.Scanner;

/**
 * Simular todas las funciones de un cajero automático
 */
public class Ejercicio_1 {
    static double Saldo_Cuenta;

    /**
     * Método para Consultar el Saldo de la Cuenta. Método Sin Retorno
     */
    public static void Consultar_Saldo() {
        System.out.println("Saldo actual: " + Saldo_Cuenta);
    }

    /**
     * Método para Retirar Dinero. Método Con Retorno
     * @param retiro
     * @return
     */
    public static boolean Retirar_Saldo(int retiro) {
        if (retiro <= Saldo_Cuenta && retiro > 0) {
            Saldo_Cuenta = Saldo_Cuenta - retiro;
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
    public static double Depositar_Saldo(int deposito) {
        Saldo_Cuenta = Saldo_Cuenta + deposito;
        return Saldo_Cuenta;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la Cantidad de Dinero que Posee en su Cuenta");
        Saldo_Cuenta = teclado.nextDouble();

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
                    Consultar_Saldo();
                    break;
                case 2:
                    System.out.print(" Ingrese la cantidad de dinero que desea retirar ");
                    int retiro = teclado.nextInt();
                    if (Retirar_Saldo(retiro)) {
                        System.out.println("Su Retiro ha sido Realizado");
                    } else {
                        System.out.println("Sin Fondos Suficientes o ha Colocado una Cantidad Errónea");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la Cantidad de Dinero que desea Depositar ");
                    int deposito = teclado.nextInt();
                    Depositar_Saldo(deposito);
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
