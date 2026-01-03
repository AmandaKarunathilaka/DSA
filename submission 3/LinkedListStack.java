package sub3;

public class LinkedListStack {
	class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
	
	private Node top = null;

    // Push
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    
    // Pop
    public int pop() {
        if (top == null) {
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    
    // Display
    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(48);
        stack.push(59);
        stack.push(17);
        stack.display();
        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}
