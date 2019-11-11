/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

import java.util.Scanner;

/**
 * @author Zen
 * @version : ParsePostApp.java, v 0.1 2019/11/11 20:51 Zen Exp $
 */
public class ParsePostApp {
    public static void main(String[] args) {
        String input;
        int output;
        InToPost inToPost;
        while(true) {
            System.out.println("输入一个表达式");
            Scanner sc = new Scanner(System.in);
            if(sc.hasNext()){
                input = sc.next();
                System.out.println("输入的中缀表达式为："+input);
                inToPost = new InToPost(input);
                input = inToPost.doTrans();
                System.out.println("转换后的后缀表达式："+input);
                ParsePost parsePost = new ParsePost(input);
                output = parsePost.doParse();
                System.out.println("计算结果为:"+output);
            }
        }
    }
}