package com.advanced.collections.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(6);
        stack.push(3);
        stack.push(5);
        System.out.println("the total stack " + stack.peek());
        int top=stack.pop();
        System.out.println("top element " + top);
        System.out.println("remaing" + stack);
        System.out.println("element in stack "+stack.peek());
        System.out.println("size of stack " + stack.size());
        System.out.println("stack empty "+ stack.empty());
    }
}
