package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacciSequence(5));
        System.out.println(fibonacciSequence(7));
    }

    private static List<Integer> fibonacciSequence(Integer N) {
        List<Integer> sequence = new ArrayList<>(Arrays.asList(1, 1));
        for (int i=2; i<N; i++) {
            int next = sequence.get(sequence.size()-1) + sequence.get(sequence.size()-2);
            sequence.add(next);
        }
        return sequence;
    }
}