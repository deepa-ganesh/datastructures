package com.learning.stack;

public class Stack {

    int size;
    int[] array;
    int index;

    public Stack(int size) {
        this.size = size;
        index = -1;
        array = new int[size];
    }

    boolean push(int data) {
        if (index >= size - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            array[++index] = data;
            return true;
        }
    }

    int pop() {
        if (index < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = array[index--];
            return x;
        }
    }

    int peek() {
        if (index < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = array[index];
            return x;
        }
    }

    boolean isEmpty() {
        return index < 0;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(2);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
