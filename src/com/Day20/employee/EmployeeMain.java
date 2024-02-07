package com.Day20.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(1,"Lokesh",5000,"Chennai"),
                new Employee(2,"Rajesh",8000,"Chennai"),
                new Employee(3,"Madhesh",7500,"Chennai")
        );

        emp.stream().filter(sal->sal.getSalary()>5000)
                .map(Employee::getName).forEach(System.out::println);

        emp.stream().filter(name->name.getName().charAt(0)=='R')
                .map(Employee::getName).forEach(System.out::println);

        List<Employee> list = emp.stream().filter(name -> name.getName().startsWith("L"))
                .collect(Collectors.toList());
        System.out.println(list);

        emp.stream().map(name->name.getName().toUpperCase()).forEach(System.out::println);
//        emp.stream().max(map(sal->sal.getSalary()));

//        emp.stream().map(Employee::getName)
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//
//        emp.stream().map(Employee::getName)
//                .map(String::toLowerCase)
//                .forEach(System.out::println);
    }
}
