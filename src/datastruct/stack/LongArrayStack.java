/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

/**
 * @author Zen
 * @version 1.0: ArrayStack.java, v 0.1 2019/11/08 22:00 Zen Exp $
 * 注意：还有一些漏洞，但是我这里先忽略了。
 */
public class LongArrayStack implements Stack {
    private long [] arr;
    private int maxsize;
    private int top;
    public LongArrayStack(int s){
        maxsize = s;
        arr = new long[maxsize];
        top = -1 ;
    }
    @Override
    public boolean isEmpty() {
        return top==-1;
    }

    @Override
    public boolean isFull() {
        return top == maxsize;
    }

    @Override
    public long peek() {
        return arr[top];
    }

    @Override
    public void push(long value) {
        arr[++top] = value;
    }

    @Override
    public long pop() {
        return arr[top--];
    }
}