package ua.goit.gojavaonline.core_3.groupe_02.chastnikov.module05;


public class MaxMinArrayElement {

    private static int[] sortArray(int[] array) {
        try {
            if (array.length > 10)
                throw new IndexOutOfBoundsException();
            for (int i = 0; i < array.length - 1; i++) {
                int min = array[i];
                int min_i = i;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < min) {
                        min = array[j];
                        min_i = j;
                    }
                }
                if (i != min_i) {
                    int tmp = array[i];
                    array[i] = array[min_i];
                    array[min_i] = tmp;
                }
            }
        } catch (IndexOutOfBoundsException indexExcep) {
            System.out.println("The maximum possible length of the array is not more than 10");
            System.exit(0);
        }
        return array;
    }
    static int getMinElement(int[] array) {
        sortArray(array);
        return array[0];
    }

    static int getMaxElement(int[] array) {
        sortArray(array);
        return array[array.length - 1];
    }
}
