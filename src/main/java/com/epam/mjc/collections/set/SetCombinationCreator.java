package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    Set<String> resultSet = new HashSet<>();
    Set<String> intersection = new HashSet<>();

    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        intersection.removeAll(thirdSet);
        resultSet.addAll(intersection);

        Set<String> different = new HashSet<>(thirdSet);
        Set<String> union = new HashSet<>(firstSet);

        union.addAll(secondSet);
        different.removeAll(union);
        resultSet.addAll(different);

        return resultSet;
    }
}
