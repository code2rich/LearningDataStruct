/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

import java.util.Scanner;

/**
 * @author Zen
 * @version 1.0: StringReverseApp.java, v 0.1 2019/11/08 22:44 Zen Exp $
 */
public class StringReverseApp {
    public static void main(String[] args) {
        System.out.println("��������Ҫ��ת������");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            String input = sc.next();
            System.out.println("���������Ϊ��"+input);
            StringReverse reverse = new StringReverse(input);
            String output = reverse.doRev();
            System.out.println("��ת�������Ϊ��"+output);
        }
    }
}