package com.java.logical.jdk8.coding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordLength {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry"};

        Map<String, Integer> wordLengths = Arrays.stream(words)
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(wordLengths);  // Output: {apple=5, banana=6, cherry=6}
    }
}
