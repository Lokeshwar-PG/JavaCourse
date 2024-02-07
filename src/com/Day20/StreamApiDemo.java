package com.Day20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,5,6);
        num.stream().filter(n->n%2==0).forEach(System.out::println);
        List<Integer> collect = num.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        num.stream().map(val->val*2).forEach(System.out::println);
        num.stream().distinct().forEach(System.out::println);
    }
}
