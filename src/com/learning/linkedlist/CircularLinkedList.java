package com.learning.linkedlist;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CircularLinkedList {
    static class A<T> {
        void add(T t) {

        }
    }

    static class B extends A {
        public void a() {
            System.out.println("b");
        }
    }

    static class c extends B {
        public void a() {
           // Arrays.sort
            super.a();
            System.out.println("b");
        }
    }

    public static void main(String[] args) {




    }

    public static Iterator reverse(List list) {
        Collections.reverse(list);
        return list.iterator();
    }
}
