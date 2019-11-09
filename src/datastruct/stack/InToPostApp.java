/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

import java.util.Scanner;

/**
 * @author Zen
 * @version : InToPostApp.java, v 0.1 2019/11/09 22:43 Zen Exp $
 */
public class InToPostApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()) {
            String input = sc.next();
            InToPost inToPost = new InToPost(input);
            System.out.println("后缀表达式"+inToPost.doTrans());
        }
    }
}