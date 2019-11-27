package com.example.tftbuilder;

import java.util.Comparator;

public class CustomComparator implements Comparator<ClassCount> {

    @Override
    public int compare(ClassCount classCount, ClassCount t1) {
        return t1.getBonusRank()-classCount.getBonusRank();
    }
}
