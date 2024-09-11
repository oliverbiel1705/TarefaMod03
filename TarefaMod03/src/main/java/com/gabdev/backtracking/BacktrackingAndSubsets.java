package com.gabdev.backtracking;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingAndSubsets {
    public static void main(String[] args) {
        List<Integer> S1 = List.of(1, 2, 3);
        int n1 = 2;
        System.out.println("In: " + S1 + ", n = " + n1);
        System.out.println("Out: " + subsets(S1, n1));

        List<Integer> S2 = List.of(1, 2, 3, 4);
        int n2 = 1;
        System.out.println("\nIn: " + S2 + ", n = " + n2);
        System.out.println("Out: " + subsets(S2, n2));
    }

    public static List<List<Integer>> subsets(List<Integer> s, int n) {
        List<List<Integer>> results = new ArrayList<>();
        generateSubsets(s, n, 0, new ArrayList<>(), results);
        return results;
    }

    public static void generateSubsets(List<Integer> s, int n, int index, List<Integer> currentSubset, List<List<Integer>> results) {
        if (currentSubset.size() == n) {
            results.add(new ArrayList<>(currentSubset));
            return;
        }
        for (int i = index; i < s.size(); i++) {
            currentSubset.add(s.get(i));
            generateSubsets(s, n, i + 1, currentSubset, results);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}
