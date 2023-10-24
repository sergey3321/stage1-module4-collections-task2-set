package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();

        for (Integer a : sourceList) {
            result.add(a);
            if (a % 2 == 0) {
                while (a % 2 == 0) {
                    a = a / 2;
                    result.add(a);
                }
            } else {
                result.add(a * 2);
            }
        } return result;
    }
}


