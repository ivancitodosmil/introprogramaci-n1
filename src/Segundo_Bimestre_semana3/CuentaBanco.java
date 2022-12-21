package Segundo_Bimestre_semana3;

import java.util.Scanner;

public class CuentaBanco {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            String socio []= {"Pablo","Iván","Richar","Andy","David"};
            int cuenta[]={1234,4567,8910,1112,1314};
            int saldo[]={1200,5000,3000,2500,10000};
            boolean interruptor=true;
            int interruptor2=1;

            while (interruptor){
                System.out.println("Ingrese el Número de Su Cuenta");
                int numero_cuenta = teclado.nextInt();
                for (int indice = 0; indice < cuenta.length; indice++) {
                    if (numero_cuenta == cuenta[indice]) {
                        while (interruptor2==1){
                            System.out.println("Escriba 1 Para Realizar Un Depósito");
                            System.out.println("Escriba 2 Para Realizar Un Retiro");
                            System.out.println("Escriba 3 Para Consultar Datos");
                            System.out.println("Escriba 4 Para Salir del Programa");
                            int opcion= teclado.nextInt();
                            switch (opcion){
                                case 1:
                                    System.out.println("Ingrese la cantidad del depósito");
                                    int deposito= teclado.nextInt();
                                    if (deposito >= 0) {
                                        saldo[indice]=saldo[indice]+deposito;
                                    }else{
                                        System.out.println("Cantidad inválida");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Ingrese la cantidad del retiro");
                                    int retiro= teclado.nextInt();
                                    if (retiro <= saldo[indice] && retiro>=0) {
                                        saldo[indice]= saldo[indice]-retiro;
                                    }else{
                                        System.out.println("No posee esa cantidad de dinero");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Nombre del Socio: "+ socio[indice]);
                                    System.out.println("Cuenta: "+ cuenta[indice]);
                                    System.out.println("Saldo: "+ saldo[indice]);
                                    break;
                                case 4:
                                    interruptor2=0;
                                    interruptor=false;
                                    break;
                            }
                        }
                    }else if (indice==5){
                        //Realizamos esto para que coloquen una cuenta válida
                    }
                }
            }
        }
}

