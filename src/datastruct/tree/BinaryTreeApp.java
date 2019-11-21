/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.tree;

/**
 * @author Zen
 * @version : BinarytreeApp.java, v 0.1 2019/11/21 22:53 Zen Exp $
 */
public class BinaryTreeApp {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        for(int j = 0 ; j < 100 ; j++) {
            int n = (int)(java.lang.Math.random()*99);
            double h = (double)n;
            tree.insert(n,n);
        }
        tree.traverse(2);
    }
}