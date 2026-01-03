package sub3;

public class LinkedListFIFOQueue {
	class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
	
	private Node front = null, rear = null;

    // Enqueue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }
    
    // Dequeue
    public int dequeue() {
        if (front == null) {
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null)
            rear = null;

        return value;
    }
    
    // Display
    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();
        queue.enqueue(25);
        queue.enqueue(24);
        queue.enqueue(28);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
    }
}
