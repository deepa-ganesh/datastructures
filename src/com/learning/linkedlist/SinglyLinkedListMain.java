package com.learning.linkedlist;

public class SinglyLinkedListMain {

    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();

        SinglyLinkedList.Node node1 = new SinglyLinkedList.Node(1);
        SinglyLinkedList.Node node2 = new SinglyLinkedList.Node(2);
        SinglyLinkedList.Node node3 = new SinglyLinkedList.Node(3);
        SinglyLinkedList.Node node4 = new SinglyLinkedList.Node(33);

        linkedList.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
//        System.out.println("Loop Found " + linkedList.detectLoopUsingHash());
//        System.out.println("Loop Found " + linkedList.detectLoopUsingFlag());
        linkedList.detectAndRemoveLoop();
        System.out.println("Loop Found " + linkedList.detectLengthOfLoopUsingFlag());


//        linkedList.print();
//
//        linkedList.insertNodeAtStart(0);
//        linkedList.print();
//
//        linkedList.insertNodeAtEnd(4);
//        linkedList.print();
//
//        linkedList.insertAfter(2, 22);
//        linkedList.print();
//
//        linkedList.insertBefore(4, 33);
//        linkedList.print();
//
//        linkedList.deleteNode(33);
//        linkedList.print();
//
//        System.out.println("index " + linkedList.getIndex(4));
//
////        linkedList.deleteLinkedList();
////        linkedList.print();
//
//        System.out.println("Length " + linkedList.length());
//
//        System.out.println("Data at index 4 is " + linkedList.getAtIndex(4));
//
//        System.out.println("Data at index 3 from end is " + linkedList.getAtIndexFromEnd(3));
//
//        System.out.println("Mid element " + linkedList.getMidNode());
//
//        System.out.println("Count " + linkedList.getCountOfGivenData(22));


    }

}
