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
        System.out.println("���������֣�");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            theNumber = sc.nextInt();
        }
        System.out.println("���������Ϊ��"+theNumber);
        System.out.println("������Ϊ:"+factorial(theNumber));

    }
    public static int factorial(int n) {
        //��ֵ
        if(n==1){
            return 1;
        }else{
            //�ݹ������
            return n*factorial(n-1);
        }
    }
}