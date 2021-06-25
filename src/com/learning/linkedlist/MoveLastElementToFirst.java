package com.learning.linkedlist;

public class MoveLastElementToFirst {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(3);

        SinglyLinkedList.Node node = linkedList.head;
        SinglyLinkedList.Node temp = null;

        while (node != null) {

            if(node.next != null && node.next.next == null) {
                temp = node.next;
                node.next = null;
                break;
            }

            node = node.next;
        }

        temp.next = linkedList.head;
        linkedList.head = temp;

        linkedList.print();
    }
}
