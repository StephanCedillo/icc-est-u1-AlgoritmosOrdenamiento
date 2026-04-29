import java.util.Arrays;

public class InsertionSort {
    InsertionSort() {
    }

    int aux;

    public int[] sort(int[] arreglo, boolean asc) {
        int[] array = arreglo;
        int[] valoresObtenidos={
            0//Comparaciones
            ,0//Cambios
            ,0//Iteraciones
        };
        
        System.out.println("Arreglo Original" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            aux = array[i];
            int j = i;
            System.out.println("Iteracion: " + (i+1));
            System.out.println("Cambios del Proceso: ");
            if (asc) {
                while (j > 0 && array[j - 1] > aux) {
                    array[j] = array[j - 1];
                    j--;
                    valoresObtenidos[1]++;
                    System.out.println("El elemento "+ array[j - 1] + " cambia por el "+ array[j] +" quedando : "+Arrays.toString(array));
                
                }
            } else {
                while (j > 0 && array[j - 1] < aux) {
                    array[j] = array[j - 1];
                    j--;
                    valoresObtenidos[1]++;
                    System.out.println("El elemento "+ array[j - 1] + " cambia por el "+ array[j] +" quedando : "+Arrays.toString(array));

                }
            }

            array[j] = aux;
            valoresObtenidos[2]++;
        }
        System.out.println("Arreglo Ordenado" + Arrays.toString(array));
        return array;
    }
}
