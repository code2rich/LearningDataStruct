/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version : DLink.java, v 0.1 2019/11/14 20:34 Zen Exp $
 */
public class DouLink {
    public long dData;
    public DouLink next;
    public DouLink previous;
    public DouLink(long d) {
        dData = d;
    }
    public void displayLink(){
        System.out.print(dData+ " ");
    }
}