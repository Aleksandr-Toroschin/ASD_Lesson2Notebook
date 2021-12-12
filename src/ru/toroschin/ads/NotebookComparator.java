package ru.toroschin.ads;

import java.util.Comparator;

public class NotebookComparator implements Comparator<Notebook> {
    @Override
    public int compare(Notebook o1, Notebook o2) {
        if (o1.getPrice() < o2.getPrice()) {
            return -1;
        }
        if (o1.getPrice() == o2.getPrice()) {
            if (o1.getRam() < o2.getRam()) {
                return -1;
            }
            if (o1.getRam() == o2.getRam()) {
                return o1.getManufacturer().compareTo(o2.getManufacturer());
            }
        }
        return 1;
    }
}
