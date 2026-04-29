
public class InsertionSort {
    InsertionSort() {
    }

    /*
     * Colorcitos
     * Negro  \u001B[30m
     * Rojo \u001B[31m
     * Verde \u001B[32m
     * Amarillo \u001B[33m
     * Azul \u001B[34m
     * Púrpura \u001B[35m
     * Cian \u001B[36m
     * Blanco \u001B[37m
     * Reset \u001B[0m
     */
    int aux;
    String rojo= "\u001B[31m";
    String verde= "\u001B[32m";
    String amarillo= "\\u001B[33m";

    public int[] sort(int[] arreglo, boolean asc) {
        int[] array = arreglo.clone();
        int[] valoresObtenidos = {
                0// Comparaciones
                , 0// Cambios
                , 0// Iteraciones
        };
        int comparaciones = 0;
    int cambios = 0;
    int iteraciones = 0;
        boolean cambio = false;

        System.out.println("Arreglo Original");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            iteraciones++;
            aux = array[i];
            int j = i;
            System.out.print("\n Iteracion: " + (i + 1) + "\n");

            if (asc) {
                // ascendente
                while (j > 0 && array[j - 1] > aux) {
                    comparaciones++;
                    array[j] = array[j - 1];
                    j--;
                    valoresObtenidos[1]++;
                    System.out.println(" \n Cambio dentro de la iteracion " + (i + 1) + " : ");
                    printArray(array);
                    valoresObtenidos[0]++;
                    cambio = true;
                      cambios++;

                }
                System.out.print(cambio ? "" : "No hubo cambios" + "\n");
                cambio = false;
                valoresObtenidos[0]++;

            } else {
                // descendente
                while (j > 0 && array[j - 1] < aux) {
                    comparaciones++;
                    array[j] = array[j - 1];
                    j--;
                    valoresObtenidos[1]++;
                    System.out.println(" \n Cambio dentro de la iteracion " + (i + 1) + " : ");
                    printArray(array);
                    valoresObtenidos[0]++;
                    cambio = true;
                    cambios++;
                }
                valoresObtenidos[0]++;
                System.out.print(cambio ? "" : "No hubo cambios" + "\n");
                cambio = false;

            }

            array[j] = aux;
            valoresObtenidos[2]++;
        }
        System.out.println("Arreglo Ordenado" + "\n");
        printArray(array);
        return new int[]{comparaciones, cambios, iteraciones};
    }

    public void printArray(int[] array) {
        System.out.print(" Arreglo : [");
        for (int i : array) {
            System.out.print(i + " , ");
        }
        System.out.println("]");
    }
}
