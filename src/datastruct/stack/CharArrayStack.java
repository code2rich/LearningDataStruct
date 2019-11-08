/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

/**
 * @author Zen
 * @version 1.0: StringReverseStack.java, v 0.1 2019/11/08 22:23 Zen Exp $
 */
public class CharArrayStack implements StackC{
    private int maxsize;
    private char[] arr;
    private int top;
    public CharArrayStack(int s){
        maxsize = s;
        arr = new char[maxsize];
        top = -1;
    }
    @Override
    public char peek() {
        return arr[top];
    }

    @Override
    public void push(char c) {
        arr[++top] = c;
    }

    @Override
    public char pop() {
        return arr[top--];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == maxsize;
    }
}