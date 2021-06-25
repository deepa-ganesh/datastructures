package com.learning.linkedlist;

import java.util.HashMap;
import java.util.Map;
// 135 before food - 06/05/2021
//197
public class RemoveDuplicatesUsingHash {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

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

        while (node != null) {

            SinglyLinkedList.Node temp = node;
            map.put(temp.data, temp.data);

            while (temp.next != null && map.containsKey(temp.next.data)) {
                temp = temp.next;
            }

            node.next = temp.next;
            node = node.next;
        }

        linkedList.print();
    }
}
