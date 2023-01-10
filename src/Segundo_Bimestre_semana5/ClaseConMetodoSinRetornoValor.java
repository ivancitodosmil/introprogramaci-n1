package Segundo_Bimestre_semana5;

public class ClaseConMetodoSinRetornoValor {
    public static void main(String[] args) {
        //Crear una variable a partir de nuestra clase
        //ClaseConMetodoSinRetornoValor llamada = new ClaseConMetodoSinRetornoValor();
        //llamada.saludar();
        saludar_con_nombre(" Iván ");
        saludar_con_nombre(" Ivancito ",25);
    }
    public static void saludar (){
        System.out.println("BIENVENIDO A LA CREACIÓN DE MÉTODOS");
        System.out.println("método creado en java");
    }
    public static void saludar_con_nombre(String nombre){
        System.out.println("BIENVENID@"+nombre.toUpperCase()+"A LA CREACIÓN DE MÉTODOS");
        System.out.println("método creado en java");
    }
    public static void saludar_con_nombre(String nombre, int edad){
        System.out.println("BIENVENID@"+nombre.toUpperCase()+"A LA CREACIÓN DE MÉTODOS");
        System.out.println("método creado en java");
        System.out.println("Su edad es: "+edad);
}
}

