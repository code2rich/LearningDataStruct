/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.recursion;

import java.util.Scanner;

/**
 * @author Zen
 * @version : Factorial.java, v 0.1 2019/11/17 19:33 Zen Exp $
 */
public class FactorialApp {
    static int theNumber;
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            theNumber = sc.nextInt();
        }
        System.out.println("输入的数字为："+theNumber);
        System.out.println("计算结果为:"+factorial(theNumber));

    }
    public static int factorial(int n) {
        //基值
        if(n==1){
            return 1;
        }else{
            //递归简化问题
            return n*factorial(n-1);
        }
    }
}