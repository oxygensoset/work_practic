package org.example;

public class poisk {
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = {89, 57, 91, 47, 95, 3, 27, 22, 67, 99, 23 ,56 ,88 ,90, 1, 2, 3, 4, 5, 15, 25, 17, 11, 9};
        int x = 11;
        int result = search(arr, x);
        if (result == -1)
            System.out.print("Элемент отсутствует в массиве");
        else
            System.out.print("Элемент присутствует в индексе" + " at index "
                    + result);
    }
}