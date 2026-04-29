public class ShellSort {
    ShellSort() {
    }

    public int[] sort(int[] arreglo, boolean asc) {

        int[] array = arreglo.clone();
        int[] valoresObtenidos = {
                0// Comparaciones
                , 0// Cambios
                , 0// Iteraciones
        };
        boolean cambio= false;

        System.out.println("Arreglo Original");
        printArray(array);

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                System.out.print("\n Iteracion: " + (i+1) + "\n");
                
                int aux = array[i];
                int j;

                if (asc) {
                    for (j = i; j >= gap && array[j - gap] > aux; j -= gap) {
                        array[j] = array[j - gap];
                        valoresObtenidos[1]++;
                        valoresObtenidos[0]++;
                        System.out.println(" \n Cambio dentro de la iteracion " + (i+1) + " : ");
                        printArray(array);
                        cambio=true;
                    }
                    valoresObtenidos[0]++;

                } else {
                    for (j = i; j >= gap && array[j - gap] < aux; j -= gap) {
                        array[j] = array[j - gap];
                        valoresObtenidos[1]++;
                        valoresObtenidos[0]++;
                        System.out.println(" \n Cambio dentro de la iteracion " + (i+1) + " : ");
                        printArray(array);
                        cambio=true;
                    }
                    valoresObtenidos[0]++;

                }
                System.out.print(cambio ? "" : "No hubo cambios" + "\n");
                cambio=false;
                valoresObtenidos[2]++;
                array[j] = aux;

            }
            System.out.println("Arreglo Ordenado" + "\n");
            printArray(array);

        }
        return valoresObtenidos;
    }

    public void printArray(int[] array) {
        System.out.print(" Arreglo : [");
        for (int i : array) {
            System.out.print(i + " , ");
        }
        System.out.println("]");
    }

}
