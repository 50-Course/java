/**
 * CS 3305: Data Structures
 *
 * University of the People
 * 
 * Programming Assignment 3
 */
import jeliot.io.*;

// Node class for LinkedList
class Node {
   Node ptr;
   int value;
   public Node(int value) {
     this.value = value;
     this.ptr = null;
   }
}


// Stack implementation using
// LinkedList and the Node class
// above.
class Stack {
    private Node topNode;
    
    public Stack() {
        this.topNode = null;
    }
    
    // peek operation
    //
    // @throws IllegalStateException
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("No element in Stack");
        }
        
        return topNode.value;
    }
    

    // check if stack is empty
    public boolean isEmpty() {
        return topNode == null;
    }
    
    // push operation
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.ptr = topNode;
        topNode = newNode;
    }
    
    // pop operation
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int data = topNode.value;
        topNode = topNode.ptr;
        return data;
    }
    
} 

public class MainClass {
    public static void main() {
        // driver code to test our implementation
         Stack stack = new Stack();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop()); 
        System.out.println("Popped element: " + stack.pop()); 

        System.out.println("Is stack empty? " + stack.isEmpty()); 
    }
}