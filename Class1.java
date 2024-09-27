package com.mycompany.stackdsa;
import java.util.Stack;

public class Class1 {
    int max;
    double[] Stack;
    int top;
    Stack<Double> stacknew = new Stack<>();

    // Constructor to initialize the stack size and top index
    public Class1(int Size) {
        max = Size;
        Stack = new double[max];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(double number) {
        if (!isFull()) { // Changed to call the correct method name
            Stack[++top] = number;
        } else {
            System.out.println("STACK IS FULL.");
        }
    }

    // Method to pop an element from the stack
    public double pop() {
        if (!isEmpty()) { // Changed to call the correct method name
            return Stack[top--];
        } else {
            System.out.println("STACK IS EMPTY.");
            return -1;
        }
    }

    // Method to print elements in the stack
    public void stackloop() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY.");
        } else {
            System.out.println("STACK:");
            for (int i = top; i >= 0; i--) {
                System.out.println(Stack[i]); // Fixed typo to correctly print the stack elements
            }
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1); // Fixed method name case
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == max - 1); // Fixed method name case
    }
}

