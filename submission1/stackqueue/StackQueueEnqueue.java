package stackqueue;

import java.util.Stack;

public class StackQueueEnqueue {
	Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue operation 
    public void enqueue(int x) {
        s1.push(x);
    }

    // Dequeue operation 
    public int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        return s2.pop();
    }
    
    public static void main(String[] args) {
    	StackQueueEnqueue queue = new StackQueueEnqueue();
        queue.enqueue(8);
        queue.enqueue(60);
        queue.enqueue(37);
        System.out.println("Dequeued: " + queue.dequeue());
    }
}
