package org.example;

public class vstavka {
    public static void insertionSort(int[] sortArr) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }

    public static void main(String args[]) {
        long before = System.currentTimeMillis();
        int[] sortArr = {102, 66, 456, 1562, 155, 10};
        insertionSort(sortArr);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + "\n");
        }
        long after = System.currentTimeMillis();
        System.out.println("Время выполнение программы "+(after-before));
    }
}
