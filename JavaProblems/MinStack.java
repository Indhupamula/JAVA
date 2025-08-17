// JavaProblems/MinStack.java
import java.util.*;

class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();

    public void push(int x){
        stack.push(x);
        if(minStack.isEmpty() || x<=minStack.peek()) minStack.push(x);
    }

    public void pop(){
        if(stack.pop().equals(minStack.peek())) minStack.pop();
    }

    public int top(){ return stack.peek(); }
    public int getMin(){ return minStack.peek(); }

    public static void main(String[] args){
        MinStack s=new MinStack();
        s.push(-2); s.push(0); s.push(-3);
        System.out.println("Min: "+s.getMin());
        s.pop();
        System.out.println("Top: "+s.top()+", Min: "+s.getMin());
    }
}
