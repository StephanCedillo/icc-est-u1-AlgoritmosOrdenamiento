import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        InsertionSort insercion = new InsertionSort();

        int[] array = { 0, 1, 4, 5, 2, 5, 6, 7, 8, 1, 23, 14 };
        System.out.println("------Menu------\n 1.Ejecutar Ordenamientos\n 2.Salir");
        int opcionMenu = leer.nextInt();
        int[] valoresObtenidos;
        while (opcionMenu != 2) {
            if (opcionMenu == 1) {
                System.out.println("Metodo de Insercion");
                System.out.println("Usted quiere ordenar ascendente? (S/N)");
                String ordenamiento = leer.next();
                while (ordenamiento.equalsIgnoreCase("S") && ordenamiento.equalsIgnoreCase("N")) {
                    System.out.println("Usted ingreso un valor no detectado, vuelva a ingresar");
                    System.out.println("Usted quiere ordenar ascendente? (S/N)");
                    ordenamiento = leer.next();
                    
                }
                if (ordenamiento.equalsIgnoreCase("S")) {
                    valoresObtenidos = insercion.sort(array, true);
                } else {
                    valoresObtenidos = insercion.sort(array, false);
                }
                System.out.println("Comparaciones obtenidas; " + valoresObtenidos[0]+"\n"+ "Cambios Obtenidos:" + valoresObtenidos[1]+"\n"+"Iteraciones Obtenidas: "+ valoresObtenidos[2]);

            } else {
                System.out.println("Usted ingreso la entrada mal ");
            }
        }
        System.out.println("Usted salio del programa");

    }
}
