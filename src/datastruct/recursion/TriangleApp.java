/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.recursion;

import java.util.Scanner;

/**
 * @author Zen
 * @version : TriangleApp.java, v 0.1 2019/11/17 19:20 Zen Exp $
 */
public class TriangleApp {
    static  int theNumber;
    public static void main(String[] args) {
        System.out.println("输入一个数字");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            theNumber = sc.nextInt();
        }
        System.out.println("三角层数为："+theNumber);
        System.out.println("计算出的个数为"+triangle(theNumber));
    }

    public static int triangle(int n) {
        if(n == 1){
            return 1;
        }else{
            return (n+triangle(n-1));
        }
    }
}