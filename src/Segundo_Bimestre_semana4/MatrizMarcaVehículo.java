import java.util.Scanner;

/**
 * Programa para crear una matriz con valores recibidos con teclado
 * Luego poder realizar operaciones de :
 * 1. Búsqueda
 * 2.Modificación
 * 3. Eliminación
 * 4. Visualización
 * 5. Salida
 */
public class MatrizMarcaVehículo {
    public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el número de filas: ");
        int filas= teclado.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        int cols= teclado.nextInt();
        teclado.nextLine();
        String marcas [][]=new String[filas][cols];//Establecemos dimensión de la matriz
        //Llenado de la matriz: OPERACIÓN ESCRITURA
        for (int fila1 = 0; fila1 < filas; fila1++) {
            for (int col1 = 0; col1 < cols; col1++) {
                System.out.println("Ingrese valor para posición: ["+fila1+"] ["+col1+"]");
                System.out.println();
                marcas[fila1][col1]=teclado.nextLine().toLowerCase();
            }
        }
        boolean salir = false;
        while(!salir){ // salir == false
            System.out.println("Digite 1 para realizar una búsqueda: ");
            System.out.println("Digite 2 para modificar un valor: ");
            System.out.println("Digite 3 para eliminar un valor: ");
            System.out.println("Digite 4 para visualizar una matriz: ");
            System.out.println("Digite 5 para salir: ");
            int opcion= teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("HAS SELECCIONADO LA OPERACIÓN BÚSQUEDA");
                    System.out.println("Qué marca busca: ");
                    String marca_buscada= teclado.nextLine(). toLowerCase();
                    boolean encontrado= false;
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            if(marcas[fila][col].equals(marca_buscada)){
                                System.out.println("Si se encontró la marca: "+marca_buscada);
                                System.out.println("en la posición: ["+fila+"] ["+col+"] ");
                                encontrado=true;
                                break;
                            }
                        }
                    }
                    if(encontrado==false)
                        System.out.println("Marca no encontrada");
                    break;
                case 2:
                    System.out.println("HAS SELECCIONADO LA OPERACIÓN DE MODIFICACIÓN");
                    System.out.println("Ingrese que fila desea modificar: ");
                    int fila1 = teclado.nextInt();
                    System.out.println("Ingrese que columna desea modificar: ");
                    int col1= teclado.nextInt();
                    System.out.println("Cuál es la nueva marca a ingresar");
                    String nueva_marca = teclado.nextLine();
                    marcas[fila1][col1] = nueva_marca;
                    break;

                case 3:
                    System.out.println("HAS SELECCIONADO LA OPERACIÓN DE ELIMINACIÓN");
                    System.out.println("Que marca vas a eliminar: ");
                    String marca_a_eliminar=teclado.nextLine().toLowerCase();
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                           if(marcas [fila][col].equals(marca_a_eliminar)){
                               marcas [fila][col]="";
                           }
                        }

                    }
                    break;
                case 4:
                    System.out.println("HAS SELECCIONADO LA OPCIÓN LECTURA");
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < cols; col++) {
                            System.out.print(marcas[fila][col] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("HASTA PRONTO");
                    salir=true;
                    break;
                default:
                    System.out.println("OPCIÓN INVÁLIDA");
            }
        }
    }
}
