package com.learning.linkedlist;

public class RemoveDUplicatesFrtomUnsorted {
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
        linkedList.add(3);
        linkedList.add(3);

        SinglyLinkedList.Node node = linkedList.head;

        while (node != null) {

            SinglyLinkedList.Node temp = node;

            while (temp != null) {

                while (temp.next != null && node.data == temp.next.data) {
                    temp.next = temp.next.next;
                }

                temp = temp.next;
            }

            node = node.next;

        }

        linkedList.print();

    }
}
