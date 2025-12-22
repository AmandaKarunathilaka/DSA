//Implement Queue using two stacks in dequeue friendly

package dsa1;

import java.util.Stack;
public class StackQueueDequeue {
	Stack<Integer> pushStack = new Stack<>();
    Stack<Integer> popStack = new Stack<>();
    
    // Enqueue operation
    public void enqueue(int data) {
        // Move all elements to pushStack
        while (!popStack.isEmpty()) {
            pushStack.push(popStack.pop());
        }

        pushStack.push(data);

        // Move back to popStack
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }
    }
    
    // Dequeue operation
    public int dequeue() {
        if (popStack.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return popStack.pop();
    }
    
    public static void main(String[] args) {
    	StackQueueDequeue q = new StackQueueDequeue();

        q.enqueue(11);
        q.enqueue(15);
        q.enqueue(24);

        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue());
        System.out.println(q.dequeue()); 
    }

}
