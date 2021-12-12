package ru.toroschin.ads;

import java.util.Random;

public class MyArray {
    public static int minPrice = 500;
    public static int maxPrice = 2000;
    public static int minRam = 4;
    public static int maxRam = 24;
    private static final String[] manufacturers = {"Acer",
            "Asus",
            "Dell",
            "HP",
            "Lenovo",
            "Samsung",
            "Apple",
            "HUAWEI",
            "IRBIS",
            "LG",
            "XIAOMI",
            "MSI"};

    public static Notebook[] getArray(int length, int stepPrice, int stepRam) {
        Random random = new Random();
        Notebook[] array = new Notebook[length];
        for (int i = 0; i < length; i++) {
            array[i] = new Notebook(minPrice + random.nextInt((maxPrice - minPrice) / stepPrice) * stepPrice,
            minRam + random.nextInt((maxRam - minRam) / stepRam) * stepRam,
            manufacturers[random.nextInt(manufacturers.length)]);
        }
        return array;
    }
}
