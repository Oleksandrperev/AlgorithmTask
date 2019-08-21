package algorithm.task1;

public class Element {

    public static int findElement(int[] array1, int[] array2, int k) {

        int i = 0;
        int j = 0;

        if (k == 1) {
            if (array1.length == 0) {
                return array2[j + 1];
            } else if (array2.length == 0) {
                return array1[i + 1];
            } else if (array1[i] < array2[j]) {
                return array2[j];
            } else {
                return array1[i];
            }
        }

        if (k == array1.length + array2.length - 1) {
            if (array1.length == 0) {
                return array2[array2.length - 1];
            } else if (array2.length == 0) {
                return array1[array1.length - 1];
            } else if (array1[array1.length - 1] < array2[array2.length - 1]) {
                return array2[array2.length - 1];
            } else {
                return array1[array1.length - 1];
            }
        }

//        int[] array1 = {1, 3, 4, 7};
//        int[] array2 = {2, 5, 6};

        boolean isArray1 = false;
        while (i + j < k + 1) {
            if (array1[i] < array2[j]) {
                i++;
                isArray1 = true;
            } else {
                j++;
                isArray1 = false;
            }
        }
        if (isArray1) {
            return array1[i - 1];
        } else {
            return array2[j - 1];
        }
    }
}





