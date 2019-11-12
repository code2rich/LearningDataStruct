/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version : Link.java, v 0.1 2019/11/12 21:12 Zen Exp $
 */
public class Link {
    public int iData;
    public double dData;
    public Link next;
    public Link(int id , double dd) {
        iData = id;
        dData = dd;
    }
    public void displayLink(){
        System.out.println(" {"+iData+","+dData+"}");
    }
}