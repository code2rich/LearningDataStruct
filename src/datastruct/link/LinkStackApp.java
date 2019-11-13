/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version 1.0: LinkStackApp.java, v 0.1 2019/11/13 21:54 Zen Exp $
 */
public class LinkStackApp {
    public static void main(String[] args) {
        LinkStack stack = new LinkStack();
        stack.push(20,20.0);
        stack.push(30,30.0);
        stack.displayStack();
        stack.push(40,40);
        stack.push(50,50);
        stack.displayStack();
        stack.pop();
        stack.displayStack();
    }
}