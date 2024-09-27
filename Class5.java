
package com.mycompany.stackdsa;

public class Class5 extends Class4{

    public Class5(int Size) {
        super(Size);
    }

    void count() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   public class Class55 extends Class4{
        public Class55(int Size) {
        super(Size);
   }
   
    }
    
    public void addStack() {
        for (int i = 0; i <= top; i++) {
            if (!isFull()) {
                System.out.println("STACK COLLECTION ADDED TO ANOTHER STACK COLLECTION: " + Stack[i]);
                stacknew.push(Stack[i]);
            }
            else {
                System.out.println("STACK IS FULL.");
            }
        }
    }
    
    public void newloopstack() {
        if (isEmpty()) {
            System.out.println("STACK IS EMPTY.");
        }
        else {
            System.out.println("NEW STACK ELEMENT: ");
            int loopLimit = Math.min(top, stacknew.size() - 1);
            for (int i = 0; i <= loopLimit; i++) {
                System.out.println(stacknew.get(i));
            }
        }
    }
}
