
package com.mycompany.stackdsa;


public class Class4 extends Class3 {
    
    
    public Class4(int Size) {
        super(Size);
    }
    
    public double peek() {
        if (!isEmpty()) {
            return Stack[top];
        }
        else {
            System.out.println("TOP IS EMPTY.");
            return -1;
        }
    }
    public double bot() {
        if (!isEmpty()) {
            return Stack[0];
        }
        else {
            System.out.println("BOT IS EMPTY.");
            return -1;
        }
    }
}

