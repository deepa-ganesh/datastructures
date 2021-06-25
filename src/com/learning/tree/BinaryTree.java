package com.learning.tree;

public class BinaryTree<T> {

    Node<T> root;

    static class Node<T> {
        T data;
        Node left;
        Node right;

        public Node(T data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public Node add(Node<Integer> current, Integer data) {
        if (current == null) {
            return new Node<>(data);
        }

        if (data < current.data) {
            current = add(current.left, data);
        } else if (data > current.data) {
            current = add(current.right, data);
        } else {
            return current;
        }

        return current;

    }

    public static void main(String[] args) {

    }
}
