package org.example;

public class masiv {
    public static void selectionSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i;
            int min = sortArr[i];
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            sortArr[i] = min;
        }
    }

    public static void main(String args[]) {
        long before = System.currentTimeMillis();
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        selectionSort(sortArr);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.print(sortArr[i] + "\n");
        }
        long after = System.currentTimeMillis();
        System.out.println("Время выполнение программы "+(after-before));
    }
}
