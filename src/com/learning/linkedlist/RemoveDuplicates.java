package com.learning.linkedlist;

public class RemoveDuplicates {
    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(5);
        linkedList.add(5);

        SinglyLinkedList.Node node = linkedList.head;

        SinglyLinkedList list = new SinglyLinkedList();

        while (node != null) {
            list.add(node.data);
            SinglyLinkedList.Node temp = node;

            while (temp.next != null && temp.next.data == temp.data) {
                temp = temp.next;
            }

            node.next = temp.next;
            node = node.next;
        }

        linkedList.print();

    }
}
