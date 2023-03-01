public class Main {
    public static void main(String[] args) {
      Mmustlinkedin m = new Mmustlinkedin();
        m.add(12);
        m.add(13);
        m.add(14);
        m.add(15);
        m.add(16);
        m.add(17);
        m.print();
        m.remove(15);
        Stack s = new Stack();
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);
        System.out.println(s.pop());
        Queue s = new Queue();
        s.enqueue(12);
        s.enqueue(13);
        s.enqueue(14);
        s.enqueue(15);
        System.out.println(s.isEmpty());
    }
}
public class Queue {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
public class Stack {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = top.data;
        top = top.next;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
