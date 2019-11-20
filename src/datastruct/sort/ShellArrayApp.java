/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version : ShellArrayApp.java, v 0.1 2019/11/20 21:02 Zen Exp $
 */
public class ShellArrayApp {
    public static void main(String[] args) {
        ShellArray arr = new ShellArray(100);
    for(int j = 0 ; j < 100 ; j++) {
        long n = (int)(java.lang.Math.random()*99);
        arr.insert(n);
    }
    arr.display();
    arr.shellSort();
    arr.display();
    }
}