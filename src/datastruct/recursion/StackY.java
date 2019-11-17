/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.recursion;

/**
 * @author Zen
 * @version : StackY.java, v 0.1 2019/11/17 22:31 Zen Exp $
 */
public class StackY {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public StackY(int s){
        maxSize =s ;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int p) {
        stackArray[++top] = p;
    }
    public int pop(){
        return stackArray[top--];
    }
    public int peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
}