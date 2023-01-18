package Segundo_Bimestre_semana6;

public class AmbitoVariable {
    static int numero=10; // Creación de variable global

    public static void cambiar_valor(){
        numero=numero+15;
        int valor = 5;
    }
    public void cambiar_valor(int numero){
       this.numero=this.numero+50;
    }

    public static void main(String[] args) {
        cambiar_valor();
        System.out.println("El nuevo valor de número es igual a "+numero);
        AmbitoVariable mivariable = new AmbitoVariable();
        mivariable.cambiar_valor(100);
        System.out.println("El nuevo valor de número es igual a "+numero);

        int indice=0;
        for ( indice = 0; indice < 5; indice++) {
            System.out.println("repetición: "+indice);
        }
        System.out.println("El valor final de indice: "+indice);
    }
}
