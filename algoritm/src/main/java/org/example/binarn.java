package org.example;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class binarn {
    public static void main(String args[]) {
        int counter, num, item, array[], first, last;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        num = input.nextInt();

        array = new int[num];

        System.out.println("Введите " + num + " чисел");

        //Заполняем массив, вводя элементы в консоль
        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();

        Arrays.sort(array);

        System.out.println("Введите элемент для бинарного поиска: ");
        item = input.nextInt();
        first = 0;
        last = num - 1;

        // метод принимает начальный и последний индекс, а также число для поиска
        binarySearch(array, first, last, item);

    }
}
