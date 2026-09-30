package com.coder.stream;

import java.util.*;

public class StreamExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        numbers.stream()
               .filter(x -> x > 20)
               .forEach(x -> System.out.println(x));
    }
}