/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version : DoubleLinkList.java, v 0.1 2019/11/14 20:36 Zen Exp $
 */
public class DoubleLinkList {
    private DouLink first;
    private DouLink last;
    public DoubleLinkList(){
        first = null;
        last = null;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void insertFirst(long dd){
        DouLink newLink = new DouLink(dd);
        if(isEmpty()){
            last = newLink;
        }else{
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }
    public void insertLast(long dd){
        DouLink newLink = new DouLink(dd);
        if(isEmpty()) {
            first = newLink;
        }else{
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }
    public DouLink deleteFirst(){
        DouLink temp = first;
        if(first.next==null){
            last = null;
        }else{
            first.next.previous = null;
        }
        first=first.next;
        return temp;
    }
    public DouLink deleteLast(){
        DouLink temp = last;
        if(first.next ==null){
            first = null;
        }else{
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }
    public boolean insertAfter(long key,long dd) {
        DouLink current = first;
        while(current.dData !=key) {
            current = current.next;
            if(current == null){
                return  false;
            }
        }
        DouLink newLink = new DouLink(dd);
        if(current==last) {
            newLink.next = null;
            last = newLink;
        }else{
            newLink.next = current;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }
    public DouLink deleteKey(long key) {
        DouLink current = first;
        while(current.dData!=key) {
            current = current.next;
            if(current == null) {
                return null;
            }
        }
        if(current == first){
            first = current.next;
        }else{
            current.previous.next = current.next;
        }
        if(current==last){
            last = current.previous;
        }else{
            current.next.previous = current.previous;
        }
        return current;
    }
    public void displayForward(){
        System.out.print("从前往后显示链表信息");
        DouLink current = first;
        while(current.next!=null){
            current.displayLink();
            current= current.next;
        }
        System.out.println();
    }
    public void displayBackward(){
        System.out.println("从后往前显示");
        DouLink current = last;
        while(current.previous!=null){
            current.displayLink();
            current= current.previous;
        }
        System.out.println();
    }
}