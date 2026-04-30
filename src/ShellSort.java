public class ShellSort {
    ShellSort() {
    }

    public int[] sort(int[] arreglo, boolean asc) {

        int[] array = arreglo.clone();

        String rojo = "\u001B[31m";
        String amarillo = "\u001B[33m";
        String reset = "\u001B[0m";

        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;

        System.out.println(rojo + "Arreglo Original : " + reset);
        System.out.println(amarillo + printArray(array) + reset);

        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                iteraciones++;
                System.out.print(rojo + "\n I" + (iteraciones) + " : " + reset);
                int aux = array[i];
                int j;

                if (asc) {
                    for (j = i; j >= gap && array[j - gap] > aux; j -= gap) {
                        System.out.print(amarillo + printArray(array) + reset + "  ");
                        array[j] = array[j - gap];
                        comparaciones++;
                        System.out.println("gap: " + gap + "   " + "a: " + j + "  " + "b : " + (j - gap)
                                + "  " + "a: [" + array[j] + "]  " + "b: [" + aux + "]" + "  " + "cambio: "
                                + " si ");
                        cambios++;
                    }

                } else {
                    for (j = i; j >= gap && array[j - gap] < aux; j -= gap) {
                        System.out.print(amarillo + printArray(array) + reset + "  ");
                        array[j] = array[j - gap];
                        comparaciones++;
                        System.out.println("gap: " + gap + "   " + "a: " + j + "  " + "b : " + (j - gap)
                                + "  " + "a: [" + array[j] + "]  " + "b: [" + aux + "]" + "  " + "cambio: "
                                + " si ");
                        cambios++;
                    }

                }

                array[j] = aux;
                if (j - gap >= 0) {
                    System.out.println(amarillo + printArray(array) + reset + "  " + "gap: " + (j-gap )+ "   " + "a: " + j
                            + "  " + "b : " + (j)
                            + "  " + "a: [" + array[j] + "]  " + "b: [" + array[j-gap] + "]" + "  " + "cambio: "
                            + " no ");
                    comparaciones++;

                }

            }
        }
        System.out.println("\n" + rojo + "Arreglo Ordenado" + reset);
        System.out.println(amarillo + printArray(array) + reset + "\n");
        return new int[] { comparaciones, cambios, iteraciones };
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

}
