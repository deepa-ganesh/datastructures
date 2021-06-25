package com.learning.linkedlist;

import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class SinglyLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;
        boolean visitFlag;
        int index;

        Node(int data) {
            this.data = data;
        }
    }

    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }

        Node node1 = head;

        while (node1 != null) {
            if (node1.next == null) {
                node1.next = node;
                break;
            }

            node1 = node1.next;
        }
    }

    /**
     * Loop and print each value
     */
    public void print() {
        if (head != null) {

            Node node = head;

            System.out.println("***********");
            while (node != null) {
                System.out.println(node.data);
                node = node.next;
            }

        }
    }

    public void insertNodeAtStart(int newData) {
        Node node = new Node(newData);
        node.next = head;
        head = node;
    }

    public void insertNodeAtEnd(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        Node node = head;

        while (node != null) {
            if (node.next == null) {
                node.next = newNode;
                break;
            }

            node = node.next;
        }
    }

    public void insertAfter(int data, int newData) {

        Node newNode = new Node(newData);

        if (head == null) {
            return;
        }

        Node node = head;

        while (node != null) {
            if (node.data == data) {
                newNode.next = node.next;
                node.next = newNode;
                break;
            }
            node = node.next;
        }
    }

    public void insertBefore(int data, int newData) {
        if (head == null)
            return;

        Node newNode = new Node(newData);

        Node node = head;

        while (node != null) {
            if (node.next != null && node.next.data == data) {
                newNode.next = node.next;
                node.next = newNode;
                break;
            }
            node = node.next;
        }
    }

    public void deleteNode(int data) {

        if (head == null)
            return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node node = head;

        while (node != null) {

            if (node.next != null && node.next.data == data) {

                node.next = node.next.next;
                break;

            }
            node = node.next;
        }
    }

    public int getIndex(int data) {
        if (head == null)
            return -1;

        Node node = head;
        int index = 0;

        while (node != null) {
            index++;
            if (node.data == data)
                break;

            node = node.next;
        }

        return index;
    }

    public void deleteLinkedList() {
        head = null;
    }

    public int length() {
        int length = 0;

        if (head == null)
            return length;

        Node node = head;

        while (node != null) {
            length++;
            node = node.next;
        }

        return length;
    }

    public int getAtIndex(int index) {

        int data = 0;

        if (head == null)
            return -1;

        if (index == 0)
            return head.data;

        Node node = head;
        int ind = 0;

        while (node != null) {
            ind++;

            if (index == ind) {
                data = node.data;
                break;
            }

            node = node.next;
        }

        return data;
    }

    /**
     * Find the length
     * <p>
     * Subtract index from length and loop again till subtracted value + 1
     *
     * @param index
     * @return
     */
    public int getAtIndexFromEnd(int index) {
        int data = 0;
        int length = 0;

        if (head == null)
            return -1;

        Node node = head;

        while (node != null) {
            length++;
            node = node.next;
        }

        if (length > index) {

            int len = (length - index) + 1;

            Node temp = head;

            for (int i = 0; i < len; i++) {
                data = temp.data;
                temp = temp.next;
            }

        }

        return data;
    }

    public int getMidNode() {
        int length = 0;
        int data = 0;

        if (head == null)
            return -1;

        Node node = head;

        while (node != null) {
            length++;
            node = node.next;
        }

        int mid = (length / 2) + 1;

        Node temp = head;

        for (int i = 0; i < mid; i++) {
            data = temp.data;
            temp = temp.next;
        }

        return data;
    }

    public int getCountOfGivenData(int data) {
        int count = 0;

        if (head == null) {
            return 0;
        }

        Node node = head;

        while (node != null) {
            if (node.data == data) {
                count++;
            }
            node = node.next;
        }

        return count;
    }

    public boolean detectLoopUsingHash() {
        boolean loopFound = false;

        Set<Node> hashSet = new HashSet<>();

        if (head == null) {
            return loopFound;
        }

        Node node = head;

        while (node != null) {
            if (hashSet.contains(node)) {
                loopFound = true;
                break;
            }

            hashSet.add(node);
            node = node.next;
        }

        return loopFound;
    }

    public boolean detectLoopUsingFlag() {
        boolean loopFound = false;

        if (head == null) {
            return loopFound;
        }

        Node node = head;

        while (node != null) {
            if (node.visitFlag) {
                loopFound = true;
                break;
            }

            node.visitFlag = true;
            node = node.next;
        }

        return loopFound;
    }

    public int detectLengthOfLoopUsingFlag() {
        int index = 0;

        if (head == null) {
            return 0;
        }

        Node node = head;

        while (node != null) {
            if (node.visitFlag) {
                index = index - node.index;
                break;
            }

            index++;
            node.index = index;
            node.visitFlag = true;
            node = node.next;
        }

        return index;
    }

    public void detectAndRemoveLoop() {

        if (head == null) {
            return;
        }

        Node node = head;

        while (node != null) {

            if (node.next != null && node.next.visitFlag) {
                node.next = null;
                break;
            }

            node.visitFlag = true;
            node = node.next;
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof SinglyLinkedList)) return false;
//        SinglyLinkedList that = (SinglyLinkedList) o;
//        return Objects.equals(head, that.head);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(head);
    }
}
