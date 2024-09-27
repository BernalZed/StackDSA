package com.mycompany.stackdsa;

public class Class2 extends Class1{
    
    public Class2(int Size) {
        super(Size);
    }
    
    public void count(){
        if (!isEmpty()){
            int sum = top + 1;
            System.out.println("ELEMENTS IN THE STACK:" + sum);
        }
        else{
            System.out.println("ELEMENTS IN THE STACK IS EMPTY.");
        }
    }
}
