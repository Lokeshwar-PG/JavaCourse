package com.Day18;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        //() ->{
        //    body
        //        }

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,2,3);  //()->{}
        List<Integer> collect = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> evenval = new ArrayList<>();
//        for(Integer val:list){
//            if(val%2==0){
//                evenval.add(val);
//            }
//        }
//        System.out.println("Even number are :"+evenval);
        list.forEach(n->{
            if(n%2==0){
                evenval.add(n);
            }
        });
        System.out.println("Even number are :"+evenval);


        List<Integer> integers = list.stream().distinct().collect(Collectors.toList());
        System.out.println(integers);
    }
}