public class Queue<T> {
    private Node<T> front; // Points to the front of the queue
    private Node<T> rear;  // Points to the rear of the queue
    private int size;      // Tracks the size of the queue

    // Node class for linked list representation
    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to initialize the queue
    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Enqueue: Adds an element to the rear of the queue
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = rear = newNode; // Both front and rear point to the new node
        } else {
            rear.next = newNode; // Link the new node at the rear
            rear = newNode;      // Update the rear pointer
        }
        size++;
    }

    // Dequeue: Removes and returns the element from the front
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue Underflow: Cannot dequeue from an empty queue");
        }
        T data = front.data; // Get the data from the front node
        front = front.next;  // Move the front pointer to the next node
        size--;
        if (isEmpty()) {
            rear = null; // If the queue is now empty, reset the rear pointer
        }
        return data;
    }

    // First: Returns the element at the front without removing it
    public T first() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty: No front element");
        }
        return front.data;
    }

    // IsEmpty: Checks if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Size: Returns the number of elements in the queue (optional)
    public int size() {
        return size;
    }

    // Main method to test the Queue
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        // Testing enqueue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Testing first()
        System.out.println("First element: " + queue.first()); // Output: 10

        // Testing dequeue
        System.out.println("Dequeued: " + queue.dequeue());   // Output: 10
        System.out.println("First element: " + queue.first()); // Output: 20

        // Testing isEmpty()
        System.out.println("Queue is empty: " + queue.isEmpty()); // Output: false

        // Empty the queue
        queue.dequeue();
        queue.dequeue();
        System.out.println("Queue is empty: " + queue.isEmpty()); // Output: true
    }
}


