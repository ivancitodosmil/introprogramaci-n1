public class OperadoLogico {
    public static void main(String[] args) {

        System.out.println("Prueba de Operadores Lógicos o Booleanos");
        boolean valor = (5==5);//Operador relacional
        boolean valor_logico = ((5==5)||(4>=3));//V or V -> V
        boolean valor_logico_and = ((5==5) && (4>=3));//V or V -> V

        System.out.println("valor: " +valor );
        System.out.println("valor logico:" +valor_logico);
        System.out.println("valor logico and: "+valor_logico_and);
        System.out.println("negacion de valor logico: "+ !valor_logico );

    }
}
