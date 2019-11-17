/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.recursion;

/**
 * @author Zen
 * @version : StackX.java, v 0.1 2019/11/17 22:07 Zen Exp $
 */
public class StackX {
    private int maxSize;
    private Parame[] stackArray;
    private int top;
    public StackX(int s) {
        maxSize = s;
        stackArray = new Parame[maxSize];
        top = -1;
    }
    public void push(Parame p) {
        stackArray[++top] = p;
    }
    public Parame pop(){
        return stackArray[top--];
    }
    public Parame peek(){
        return stackArray[top];
    }

}