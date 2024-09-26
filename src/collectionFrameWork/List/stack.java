package collectionFrameWork.List;

import java.util.Stack;
import java.util.Vector;

/*
1:Stack is a class that represents a Last-In-First-Out (LIFO) data structure. It extends Vector
2:LIFO (Last-In-First-Out): The last element that was added is the first to be removed.
Extends Vector: It inherits the synchronized nature of Vector but with additional methods specifically for stack operations.
Methods:
push(E item): Pushes an item onto the top of the stack.
pop(): Removes and returns the item at the top of the stack.
peek(): Looks at the item at the top of the stack without removing it.
empty(): Checks if the stack is empty.
search(Object o): Returns the 1-based position from the top of the stack if the object exists, or -1 if not found.
 */
public class stack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        // Pushing elements onto the Stack

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date");


        System.out.println(stack);

        // Peek at the top element without removing it
        System.out.println("Top element: " + stack.peek());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // Display the stack after pop
        stack.pop();
        System.out.println("Stack after pop: " + stack);


        //searching for an element:the 1-based position from the top of the stack where the object is located; the return value -1 indicates that the object is not on the stack.
        int a=stack.search("Banana");
        if(a!=-1){
            System.out.println("Banana is at position:"+a);
        }
        else{
            System.out.println("Banana is not found in stack");
        }


    }

}
