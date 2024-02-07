package com.Day25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class TotalOfNum {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 10, 20, 20, 40);

        Optional<Integer> minimum = integerList.stream().min(Integer::compareTo);
        minimum.ifPresent(min -> System.out.println(min));
        Optional<Integer> maximum = integerList.stream().max(Integer::compareTo);
        maximum.ifPresent(max -> System.out.println(max));

        Optional<Integer> min = integerList.stream().min(Comparator.comparing(Integer::intValue));
        System.out.println(min);

        int sum = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
