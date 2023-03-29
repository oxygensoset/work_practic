package org.example;

public class Main {
    public static void bubbleSort(int[] sortArr){
        long before = System.currentTimeMillis();
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String args[]) {
        long before = System.currentTimeMillis();
        long start = System.nanoTime();
        int[] sortArr = {1, 2, 3, 4, 5, 6};
        bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
        long after = System.currentTimeMillis();
        System.out.println("Время выполнение программы "+(after-before));
    }
}