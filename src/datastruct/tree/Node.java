/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.tree;

/**
 * @author Zen
 * @version : Node.java, v 0.1 2019/11/21 21:43 Zen Exp $
 */
public class Node {
    public int iData;
    public double dData;
    public Node leftChild;
    public Node rightChild;
    public void displayNode(){
        System.out.print("[ " + iData +','+dData+']');
    }
}