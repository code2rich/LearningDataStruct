/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

/**
 * @author Zen
 * @version 1.0: ArrayStackApp.java, v 0.1 2019/11/08 22:09 Zen Exp $
 */
public class ArrayStackApp {
    public static void main(String[] args) {
        LongArrayStack longArrayStack = new LongArrayStack(100);
        longArrayStack.push(100);
        longArrayStack.push(33);
        longArrayStack.push(44);
        longArrayStack.push(55);
        longArrayStack.push(77);
        longArrayStack.push(8);
        longArrayStack.push(9119);
        while(!longArrayStack.isEmpty()){
            long value = longArrayStack.pop();
            System.out.print(value+"  ");
        }
        System.out.println();
    }
}