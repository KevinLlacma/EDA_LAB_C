package Lab08.ejercicio2;

import java.util.Stack;

public class ColaDosPilas<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    public ColaDosPilas() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    
    public void enqueue(T item) {
        stack1.push(item);
    }

   
    public T dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.pop();
    }

    
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    
    public int size() {
        return stack1.size() + stack2.size();
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Cola vacia");
            return;
        }

        Stack<T> tempStack = new Stack<>();

        // Print elements in stack2 (which are in correct order)
        while (!stack2.isEmpty()) {
            tempStack.push(stack2.pop());
        }
        while (!tempStack.isEmpty()) {
            T item = tempStack.pop();
            System.out.print(item + " ");
            stack2.push(item);
        }

        // Print elements in stack1 (in reverse order)
        for (int i = stack1.size() - 1; i >= 0; i--) {
            System.out.print(stack1.get(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ColaDosPilas<Integer> queue = new ColaDosPilas<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        
        queue.printQueue(); 

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue()); 
        
        queue.printQueue(); 

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Dequeued: " + queue.dequeue()); 
        
        queue.printQueue(); 

        
    }
}
