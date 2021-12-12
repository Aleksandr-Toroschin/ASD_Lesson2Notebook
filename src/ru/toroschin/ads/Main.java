package ru.toroschin.ads;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        exercise1();


    }

    public static void exercise1() {
        final int length = 10000;
        final int priceStep = 50;
        final int ramStep = 4;

        // заполнить массив из ноутбуков
        Notebook[] array = MyArray.getArray(length, priceStep, ramStep);
//        System.out.println(Arrays.toString(array));

        // отсортировать
        Arrays.sort(array, new NotebookComparator());

        // вывести на экран?
        System.out.println(Arrays.toString(array));
    }

    

}
