
public class InsertionSort {
    InsertionSort() {
    }

    int aux;

    public int[] sort(int[] arreglo, boolean asc) {
        int[] array = arreglo.clone();
        int[] valoresObtenidos={
            0//Comparaciones
            ,0//Cambios
            ,0//Iteraciones
        };
        
        System.out.println("Arreglo Original" );
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            aux = array[i];
            int j = i;
            System.out.println("Iteracion: " + (i+1) + "\n");
            System.out.println("Cambios del Proceso: ");
            if (asc) {
                // ascendente
                while (j > 0 && array[j - 1] > aux) {
                    array[j] = array[j - 1];
                    j--;
                    valoresObtenidos[1]++;
                    System.out.println(" \n Cambio dentro de la iteracion: ");
                    printArray(array);
                    valoresObtenidos[0]++;
                
                
                }
                valoresObtenidos[0]++;
                
            } else {
                // descendente 
                while (j > 0 && array[j - 1] < aux) {
                    array[j] = array[j - 1];
                    j--;
                    valoresObtenidos[1]++;
                    System.out.println(" \n Cambio dentro de la iteracion: ");
                    printArray(array);
                    valoresObtenidos[0]++;
                }
                valoresObtenidos[0]++;

            }

            array[j] = aux;
            valoresObtenidos[2]++;
        }
        System.out.println("Arreglo Ordenado");
        printArray(array);
        return valoresObtenidos;
    }
    public void printArray(int[] array){
        System.out.print(" Arreglo : [");
        for (int i : array) {
            System.out.print(i + " , ");
        } 
        System.out.println("]");
    }
}
