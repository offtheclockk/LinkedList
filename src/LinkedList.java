public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    //addLast
    public void addLast(int item) {
        var node = new Node(item);

        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    //addFirst
    public void addFirst(int item) {
        var node = new Node(item);

        if (first == null)
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    //deleteFirst

    //contains

    //indexOf
}
