package com.learning.linkedlist;

public class SwapNodes {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        SinglyLinkedList.Node node = linkedList.head;

        int x = 2;
        int y = 4;

        while (node != null) {

            if (node.next != null && node.next.data == x) {

                SinglyLinkedList.Node tempX = node.next.next;

                SinglyLinkedList.Node temp = node;

                while (temp != null) {

                    if (temp.next != null && temp.next.data == y) {

                        SinglyLinkedList.Node tempY = temp.next.next;

                        temp.next.next = tempX;

                        SinglyLinkedList.Node temp1 = node.next;
                        temp1.next = tempY;

                        node.next = temp.next;
                        temp.next = temp1;
                        break;
                    }

                    temp = temp.next;
                }

                break;
            }

            node = node.next;
        }

        linkedList.print();
    }
}
