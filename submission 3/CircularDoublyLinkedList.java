package sub3;

public class CircularDoublyLinkedList {
	class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }
	
	private Node head = null;
	
	// Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;
            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }
    }
    
    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.insert(8);
        cdll.insert(7);
        cdll.insert(6);
        cdll.display();
    }
}
