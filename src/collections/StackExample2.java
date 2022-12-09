package collections;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<>();
        stack1.push("Zaur");
        stack1.push("Misha");
        stack1.push("Oleg");
        stack1.push("Katya");
        System.out.println(stack1);
//        while (!stack1.isEmpty()) {
//            System.out.println(stack1.pop());
//            System.out.println(stack1);
        System.out.println(stack1.peek());
        }
    }

