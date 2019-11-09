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

    /**
     * 一般栈之类的其实是受限访问的，但是我们在设计这个类的时候可以灵活处理。
     * 我们需要获取到数组中的数据，所以开放了这个方法。
     * @param n
     * @return
     */
    public char peekN(int n ) {
        return arr[n];
    }

    public void displayStack(String s){
        System.out.println(s);
        System.out.println("Stack (bottom --> top)");
        for(int j = 0 ; j < top+1 ; j++) {
            System.out.print(peekN(j));
        }
        System.out.println();
    }
}