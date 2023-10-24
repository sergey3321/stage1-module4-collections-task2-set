package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squaresSet = new TreeSet<>();

        for (int number:sourceList) {
            squaresSet.add(number * number);
        }

        return squaresSet.subSet(lowerBound, true, upperBound, true);
    }
}
