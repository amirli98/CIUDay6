package com.company.overview;

import java.util.*;

public class StackAndQueueOverview {
    public static void main(String[] args) {
        /*Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(256);
        stack1.push(23234);
        stack.push(34);
        stack.push(23);
        for (int i = 0; i <10 ; i++) {
            stack.push(new Random().nextInt());
        }
        stack.addAll(stack1);
        System.out.println(stack.capacity());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack1.peek().toString());*/
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(12);
        queue.add(34);
        queue.add(3454);
        queue.add(1);
        queue.add(45);
        System.out.println(queue);
        System.out.println(queue.element());
        queue.offer(3);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue);
        Queue<Integer> queue1 = new LinkedList<>();
        System.out.println(queue1.isEmpty());
    }
}
