package com.learning.linkedlist;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {

        boolean isPalindrome = false;

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);

        linkedList.print();

        SinglyLinkedList.Node node = linkedList.head;

        if (node == null)
            return;

        Stack<Integer> stack = new Stack<>();

        while (node != null) {
            stack.push(node.data);
            node = node.next;
        }

        SinglyLinkedList.Node node1 = linkedList.head;

        while (node1 != null) {

            if (node1.data != stack.pop().intValue()) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }

            node1 = node1.next;
        }

        System.out.println(isPalindrome);
    }
}
