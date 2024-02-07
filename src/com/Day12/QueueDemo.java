package com.Day12;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Lokesh");
        queue.add("Rajesh");
        queue.add("Madhesh");
        queue.add("Pavan");
        queue.add("Sai");
        queue.add("Naveen");
        queue.add("Raja");
        System.out.println(queue);
        queue.remove();
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.contains("Pavan"));
    }
}
