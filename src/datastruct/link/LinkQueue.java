/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version : LinkQueue.java, v 0.1 2019/11/13 21:57 Zen Exp $
 */
public class LinkQueue {
    public FirstLastList list;
    public LinkQueue(){
        list = new FirstLastList();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void insert(int id,double dd) {
        list.insertLast(id,dd);
    }
    public Link remove(){
        return list.deleteFirst();
    }
    public void displayQueue(){
        System.out.println("队列显示数据");
        list.displayList();
    }

}