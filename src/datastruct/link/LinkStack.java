/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;


/**
 * @author Zen
 * @version : LinkStack.java, v 0.1 2019/11/13 21:50 Zen Exp $
 */
public class LinkStack {
    public LinkList list;
    public LinkStack(){
        list = new LinkList();
    }
    public void push(int id,double dd) {
        list.insertFirst(id,dd);
    }
    public Link pop(){
        return list.deleteFirst();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public void displayStack(){
        System.out.println("´òÓ¡Õ»Êý¾Ý");
        list.displayList();
    }

}