package ua.hillel.qaauto;

public class Stack {
    int stackArray[] = new int[10];
    int topOfStack;

    //initialize top-of-stack
    Stack() {
        topOfStack = -1;
    }

    // push an item into the stck
    void push(int item) {
        if (topOfStack == 9) System.out.println("stack is full");
        else
            stackArray[++topOfStack] = item;
    }

    // pop an item from the stack
    int pop() {
        if (topOfStack < 0) return 0;
        return stackArray[topOfStack--];
    }

}
