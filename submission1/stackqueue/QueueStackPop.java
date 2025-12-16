package stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStackPop {
	Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push operation 
    public void push(int x) {
        q2.add(x);

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    // Pop operation 
    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove();
    }
    
    public static void main(String[] args) {
    	QueueStackPop stack = new QueueStackPop();
        stack.push(58);
        stack.push(15);
        stack.push(49);
        System.out.println("Popped: " + stack.pop());
    }
}
