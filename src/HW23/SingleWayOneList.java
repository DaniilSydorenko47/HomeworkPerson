package HW23;

import java.util.Iterator;


public class SingleWayOneList<T> implements Iterable<T> {

    private Node<T> tail;
    private Node<T> head;
    private int size = 0;
    


    private static class Node<T>{

        private Node<T> next;
        private T data;
        private Node<T> prev;

        public Node(Node<T> next, T data, Node<T> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{ data = "+data+'}';
        }
    }

    public void add(T data) {
        Node<T> first = head;
        Node<T> newNode = new Node<>(null, data, first);
        head = newNode;
        if (first == null)
            tail = newNode;
        else
            first.prev = newNode;
        size++;

    }
    public void removeLast(){
        if (head == null){
            return;
        }
        if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node<T> current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }
    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }
    private class MyIterator implements Iterator<T> {

        private Node<T> current = head;
        //private Node<T> current = tail;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next(){
            T data = current.data;
            current = current.next;
            return data;
        }
    }
}
