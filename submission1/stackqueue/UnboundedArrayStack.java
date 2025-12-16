//Dynamic array resizing during Push and Pop

package stackqueue;

public class UnboundedArrayStack {
	private int[] stack;
    private int top;
    private int capacity;

    public UnboundedArrayStack() {
        capacity = 2;
        stack = new int[capacity];
        top = -1;
    }
    
    // Push operation
    public void push(int x) {
        if (top == capacity - 1) {
            resize(capacity * 2);
        }
        stack[++top] = x;
    }
    
    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        int popped = stack[top--];

        if (top > 0 && top == capacity / 4) {
            resize(capacity / 2);
        }

        return popped;
    }
    
    private void resize(int newCapacity) {
        int[] newStack = new int[newCapacity];
        for (int i = 0; i <= top; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
        capacity = newCapacity;
    }
    
    public static void main(String[] args) {
        UnboundedArrayStack stack = new UnboundedArrayStack();
        stack.push(15);
        stack.push(38);
        stack.push(97);
        stack.push(55);
        System.out.println("Popped: " + stack.pop());
    }
    
}
