package ru.toroschin.ads;

import java.util.Random;

public class IntegerArray {
    public static int[] getArray(int length) {
        int[] array = new int[length];
        int index = new Random().nextInt(length);
        int element = 1;
        for (int i = 0; i < length; i++) {
            array[i] = element;
            element ++;
            if (i == index) {
                element ++;
            }
        }
        return array;
    }
}
