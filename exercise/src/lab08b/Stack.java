package lab08b;


        import java.util.EmptyStackException;
        import java.util.ArrayList;
        import java.util.*;

public class Stack<T>{
    private ArrayList<T> myStack;

    public Stack(){
        myStack = new ArrayList<T>();
    }

    public void push(T value){
        myStack.add(value);

    }

    public T pop() throws EmptyStackException{ //remove last topmost object from out stack
        if(myStack.isEmpty()){
            throw new EmptyStackException();
        }else
            return myStack.remove(size()-1);
    }

    public T peak()throws EmptyStackException{// return a reference to the topmost elment
        if (myStack.isEmpty()){
            throw new EmptyStackException();
        }else
            return myStack.get(size()-1);
    }

    public int size(){
        return myStack.size();
    }

    public String toString(){
        return "Stack: " + myStack.toString();
    }
}