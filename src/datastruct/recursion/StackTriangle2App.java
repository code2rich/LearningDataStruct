/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.recursion;

import java.util.Scanner;

/**
 * @author Zen
 * @version : StackTriangle2App.java, v 0.1 2019/11/17 22:35 Zen Exp $
 */
public class StackTriangle2App {
    static int theNumer;
    static int theAnser;
    static StackY theStack;

    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            theNumer = sc.nextInt();
        }
        stackTriangle();
        System.out.println("计算结果为："+ theAnser);
    }
    public static void stackTriangle(){
        theStack = new StackY(10000);
        theAnser =0;
        while(theNumer > 0) {
            theStack.push(theNumer--);
        }
        while(!theStack.isEmpty()){
            int newN = theStack.pop();
            theAnser += newN;
        }
    }
}