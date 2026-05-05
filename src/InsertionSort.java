
public class InsertionSort {
    InsertionSort() {
    }

    /*
     * Colorcitos
     * Negro \u001B[30m
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
    String rojo = "\u001B[31m";
    String amarillo = "\u001B[33m";
    String reset = "\u001B[0m";

    public int[] sort(int[] arreglo, boolean asc) {
        int[] array = arreglo.clone();

        int comparaciones = 0;
        int cambios = 0;

        System.out.println(rojo + "Arreglo Original : " + reset);
        System.out.println(amarillo + printArray(array) + reset);

        for (int i = 0; i < array.length; i++) {
            aux = array[i];
            int j = i;
            System.out.print(i != 0 ? rojo + "\n I" + (i) + " : " + reset : "");

            if (asc) {
                // ascendente
                while (j > 0 && array[j - 1] > aux) {
                    
                    
                    
                    comparaciones++;
                    array[j] = array[j - 1];
                    if (j==i) {
                        System.out.print(amarillo + printArray(array) + reset + "  ");  
                    }else{
                        printSpecificElements(array,array[j],aux,j);
                    }
                    System.out.println("a: " + j + "  " + "b : " + (j - 1)
                            + "  " + "a: [" + array[j] + "]  " + "b: [" + aux + "]" + "  " + "cambio: "
                            + " si ");
                    
                    j--;
                    cambios++;

                }

            } else {
                // descendente
                while (j > 0 && array[j - 1] > aux) {

                    array[j] = array[j - 1];
                    if (j==i) {
                        System.out.print(amarillo + printArray(array) + reset + "  ");  
                    }else{
                        printSpecificElements(array,array[j],aux,j);
                    }
                    
                    j--;
                    comparaciones++;
                    
                    System.out.println("a: " + j + "  " + "b : " + (j - 1)
                            + "  " + "a: [" + array[j] + "]  " + "b: [" + aux + "]" + "  " + "cambio: "
                            + " si ");
                    cambios++;
                }

            }

            array[j] = aux;
            if (j != 0) {
                System.out.println(amarillo + printArray(array) + reset + "  " + "a: " + j + "  " + "b : " + (j - 1)
                        + "  " + "a: [" + array[j] + "]  " + "b: [" + array[j - 1] + "]" + "  " + "cambio: "
                        + " no ");
                comparaciones++;

            }

        }
        System.out.println("\n" + rojo + "Arreglo Ordenado" + reset);
        System.out.println(amarillo + printArray(array) + reset + "\n");
        return new int[] { comparaciones, cambios, array.length - 1 };
    }

    public String printArray(int[] array) {
        String mensaje = "";
        mensaje += "[";
        for (int i : array) {
            mensaje += i + " , ";
        }
        mensaje += "]";
        return mensaje;
    }
    // array,array[j],aux,j
    public void printSpecificElements(int[] array,int n1, int n2, int posj) {
        boolean contAux= false;
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(" ");
            if (i==posj) {
                System.out.print(n1+"  ");
                contAux=true;
                continue;
            }
            if (contAux) {
                System.out.print(n2);
                contAux=false;
                
            }
            System.out.print("    ");
            
        }
    
    }
}
