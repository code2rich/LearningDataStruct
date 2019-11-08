/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

import java.util.Scanner;

/**
 * @author Zen
 * @version : BracketCheckApp.java, v 0.1 2019/11/08 23:15 Zen Exp $
 */
public class BracketCheckApp {
    public static void main(String[] args) {
        System.out.println("请输入需要括号检测的数据");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            String input = sc.next();
            System.out.println("括号检查的数据为:"+input);
            BracketCheck bracketCheck = new BracketCheck(input);
            bracketCheck.check();
        }
    }
}