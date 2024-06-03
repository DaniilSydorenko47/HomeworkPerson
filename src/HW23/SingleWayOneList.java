package HW23;

import java.util.Iterator;


public class SingleWayOneList<T> implements Iterable<T> {

    private Node<T> tail;
    private Node<T> head;
    private int size = 0;
    


    private static class Node<T>{

        private Node<T> prev;
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return "Node{ data = "+data+'}';
        }
    }

    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
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
