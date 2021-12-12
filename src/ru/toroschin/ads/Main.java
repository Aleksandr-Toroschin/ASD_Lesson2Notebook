package ru.toroschin.ads;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    public static void exercise1() {
        final int length = 10000;
        final int priceStep = 50;
        final int ramStep = 4;

        // заполнить массив из ноутбуков
        Notebook[] array = NotebookArray.getArray(length, priceStep, ramStep);
//        System.out.println(Arrays.toString(array));

        // отсортировать
        Arrays.sort(array, new NotebookComparator());

        // вывести на экран?
        System.out.println(Arrays.toString(array));
    }

    public static void exercise2() {
        // получить массив
        int[] array = IntegerArray.getArray(10);
        System.out.println(Arrays.toString(array));
        // найти число
        System.out.println(findElement(array));
    }

    private static int findElement(int[] array) {
        int element = 1;
        for (int i = 1; i < array.length; i++) {
            if (element + 1 != array[i]) {
                element ++;
                break;
            }
            element = array[i];
        }
        return element;
    }

}
