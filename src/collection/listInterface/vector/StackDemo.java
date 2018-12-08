package collection.listInterface.Vector;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Kasem");
        stack.push("Rakib");
        stack.push("Hasan");
        stack.push("Pagol");
        stack.push("Titu");
        //System.out.println("Print the Last Vlaue = " + stack.pop());
        System.out.println("Print the Last Vlaue = " + stack.peek());
        Iterator iterable = stack.iterator();
        while (iterable.hasNext()) {
            System.out.println("Value is " + iterable.next());
        }
    }
}
