package com.company;

/*
test case 1 (25.10.2020 on HH.ru)
 */

public class Main {
    static int[] arr = {5, 2, 4, 6, 1, 3, 2, 6};

    public static void main(String[] args) {
        System.out.println("Before sorting: ");
        printArray();

        arr = myMergeSort(arr);

        System.out.println("After sorting: ");
        printArray();
    }

    static void printArray(){
        for (int value : arr) System.out.print(value + " ");
        System.out.println("\n");
    }

    public static int[] myMergeSort(int array[]) {
        if (array.length == 1) {
            return array;
        } else {
            int mid = (int) Math.floor(array.length / 2);
            int lPart[] = new int[mid];
            int rPart[] = new int[array.length - mid];

            for (int i = 0; i < array.length; i++) {
                if (i < mid)
                    lPart[i] = array[i];
                else
                    rPart[i - mid] = array[i];
            }

            lPart = myMergeSort(lPart);
            rPart = myMergeSort(rPart);
            array = merger(lPart, rPart);
            return array;
        }
    }


    public static int[] merger(int firstArray[], int secondArray[]) {
        int result[] = new int[firstArray.length + secondArray.length];
        int x = 0, y = 0;

        for (int i = 0; i < firstArray.length + secondArray.length; i++) {
            if (x == firstArray.length) {
                result[i] = secondArray[y];
                y++;
            } else if (y == secondArray.length) {
                result[i] = firstArray[x];
                x++;
            } else if (firstArray[x] > secondArray[y]) {
                result[i] = secondArray[y];
                y++;
            } else {
                result[i] = firstArray[x];
                x++;
            }
        }

        return result;
    }
}
