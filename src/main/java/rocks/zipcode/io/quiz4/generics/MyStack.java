package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable{
    Stack<SomeType> newStack;
    public MyStack() {

        newStack = new Stack<SomeType>();
    }

    public Boolean isEmpty() {
        return newStack.empty();
    }

    public void push(SomeType i) {
        newStack.push(i);
    }

    public SomeType peek() {
        if(newStack.isEmpty()){
            return null;
        }
        return newStack.peek();
    }

    public SomeType pop() {
        if(newStack.isEmpty()){
           throw new EmptyStackException();
           // return null;
        }
        return newStack.pop();
    }

    @Override
    public Iterator iterator() {
        return newStack.iterator();
    }
}
