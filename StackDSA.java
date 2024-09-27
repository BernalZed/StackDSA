
package com.mycompany.stackdsa;


import java.util.Scanner;
import java.util.Stack;

public class StackDSA {
    



    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int STACK;
        int choose;
        boolean con = false;
        System.out.println("INPUT SIZE OF STACK: ");
        STACK = scn.nextInt();
        Class5 stack = new Class5(STACK);
        System.out.println("SIZE OF STACK: " + STACK);
        
        while(!con) {
            System.out.println("\nWHICH STACK OPTION WOULD YOU CHOOSE?\n");
            System.out.println("1. PUSH ELEMENT IN THE STACK.");
            System.out.println("2. POP ELEMENT FROM THE STACK.");
            System.out.println("3. PEEK TOP ELEMENT FROM THE STACK.");
            System.out.println("4. LOOP STACK INPUT.");
            System.out.println("0. EXIT.");
            System.out.println("\nYOUR CHOICE: ");
            choose = scn.nextInt();
            
            switch (choose) {
                case 1: 
                    System.out.println("INPUT NUMBER TO PUSH IN THE STACK.");
                    int push = scn.nextInt();
                    stack.push(push);
                    break;
                case 2:
                    System.out.println("STACK POPPED: " + stack.pop());
                    break;
                case 3:
                    System.out.println("TOP ELEMENT FROM THE STACK: " + stack.peek());
                    break;
                case 4:
                    System.out.println("BOTTOM ELEMENT FROM THE STACK: " + stack.bot());
                    break;
                case 5:
                    stack.stackloop();
                    break;
                case 6:
                    stack.count();
                    break;
                case 7:
                    stack.removeDup();
                    break;
                case 8:
                    stack.addStack();
                    break;
                case 9:
                    stack.newloopstack();
                    break;
                case 0:
                    System.exit(choose);
                default:
                    System.out.println("WRONG INPUT.");
                    con = false;
                    break;
            }
        }
    }
}
