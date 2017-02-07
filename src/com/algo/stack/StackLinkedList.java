package com.algo.stack;

public class StackLinkedList<T> implements Stack<T> {

    private Node first;

    private class Node {
        private T ele;
        private Node next;
    }

    public StackLinkedList() { }

    public StackLinkedList<T> push(T ele)
    {
        Node current = first;
        first = new Node();
        first.ele = ele;
        first.next = current;
        return this;
    }

    public T pop()
    {
        if (first == null) new java.util.NoSuchElementException();
        T ele = first.ele;
        first = first.next;
        return ele;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node tmp = first;
        while (tmp != null) {
            sb.append(tmp.ele).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }

}