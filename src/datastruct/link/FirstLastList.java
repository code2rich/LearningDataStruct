/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version : FirstLastList.java, v 0.1 2019/11/13 20:57 Zen Exp $
 */
public class FirstLastList {
    public Link first;
    public Link last;
    public FirstLastList() {
        first = null;
        last = null;
    }
    public boolean isEmpty(){
        return first == null ;
    }
    public void insertFirst(int id , double dd) {
        Link newLink = new Link(id,dd);
        if(isEmpty()){
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }
    public void insertLast(int id , double dd) {
        Link newLink = new Link(id,dd);
        if(isEmpty()){
            first = newLink;
        }else{
            last.next=newLink;
        }
        last = newLink;
    }
    public Link deleteFirst(){
        Link link = first;
        if(first.next == null) {
            last = null;
        }else{
            first = first.next;
        }
        return  link;
    }
    public void displayList(){
        System.out.println("查看列表");
        Link current = first;
        while(current!=null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}