import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        String rojo = "\u001B[31m";
        String amarillo = "\u001B[33m";
        String reset = "\u001B[0m";
        Scanner leer = new Scanner(System.in);
        InsertionSort insercion = new InsertionSort();
        ShellSort shell = new ShellSort();

        int[] array = { 2, 0, -15, 10, 20, -3, -5, 7 };

        System.out.println("----------Menu----------\n 1.Ejecutar Ordenamientos\n 2.Salir");
        int opcionMenu = leer.nextInt();
        int[] valoresObtenidosInsertion;
        int[] valoresObtenidosShell;
        while (opcionMenu != 2) {

            if (opcionMenu == 1) {

                // Metodo Insertion
                System.out.println("Metodo de Insertion");
                System.out.println("Usted quiere ordenar ascendente? (S/N)");
                String ordenamientoInsertion = leer.next();
                while (!ordenamientoInsertion.equalsIgnoreCase("S") && !ordenamientoInsertion.equalsIgnoreCase("N")) {
                    System.out.println("Usted ingreso un valor no detectado, vuelva a ingresar");
                    System.out.println("Usted quiere ordenar ascendente? (S/N)");
                    ordenamientoInsertion = leer.next();

                }
                if (ordenamientoInsertion.equalsIgnoreCase("S")) {
                    valoresObtenidosInsertion = insercion.sort(array, true);
                } else {
                    valoresObtenidosInsertion = insercion.sort(array, false);
                }
                System.out.println(rojo + "Comparaciones obtenidas; " + reset + valoresObtenidosInsertion[0] + "\n"
                        + rojo + "Cambios Obtenidos:" + reset + valoresObtenidosInsertion[1] + "\n"
                        + rojo + "Iteraciones Obtenidas: " + reset + valoresObtenidosInsertion[2] + "\n");

                // Metodo Shell

                System.out.println("Metodo de Shell ");
                System.out.println("Usted quiere ordenar ascendente? (S/N)");
                String ordenamientoShell = leer.next();
                while (!ordenamientoShell.equalsIgnoreCase("S") && !ordenamientoShell.equalsIgnoreCase("N")) {
                    System.out.println("Usted ingreso un valor no detectado, vuelva a ingresar");
                    System.out.println("Usted quiere ordenar ascendente? (S/N)");
                    ordenamientoShell = leer.next();

                }
                if (ordenamientoShell.equalsIgnoreCase("S")) {
                    valoresObtenidosShell = shell.sort(array, true);
                } else {
                    valoresObtenidosShell = shell.sort(array, false);
                }
                System.out.println(rojo + "Comparaciones obtenidas; " + reset + valoresObtenidosShell[0] + "\n"
                        + rojo + "Cambios Obtenidos:" + reset
                        + valoresObtenidosShell[1] + "\n" + rojo + "Iteraciones Obtenidas: " + reset
                        + valoresObtenidosShell[2]
                        + "\n");

            } else {
                System.out.println("Usted ingreso la entrada mal ");
            }

            // Leer de nuevo
            System.out.println("------Menu------\n 1.Ejecutar Ordenamientos\n 2.Salir");
            opcionMenu = leer.nextInt();

        }
        System.out.println("Usted salio del programa");

    }
}
