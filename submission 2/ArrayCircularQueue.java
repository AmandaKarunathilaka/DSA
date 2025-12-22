package dsa1;

public class ArrayCircularQueue {
	int[] queue;
    int front, rear, size, capacity;

    ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }
    
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    public static void main(String[] args) {
        ArrayCircularQueue q = new ArrayCircularQueue(5);

        q.enqueue(8);
        q.enqueue(15);
        q.enqueue(38);

        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
        System.out.println(q.dequeue()); 
    }
}
