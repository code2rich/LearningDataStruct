/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version : LinkList.java, v 0.1 2019/11/12 21:14 Zen Exp $
 */
public class LinkList {
    private Link first;
    public LinkList(){
        first = null;
    }
    public void insertFirst(int id , double dd) {
        Link newLink = new Link(id,dd);
        newLink.next = first;
        first = newLink;
    }
    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }
    public void displayList(){
        System.out.println("œ‘ æ¡–±Ì");
        Link current = first;
        while(current!=null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return first == null;
    }
    public Link find(int key) {
        Link current = first;
        while(current.iData!=key){
            if(current.next==null) {
                return null;
            }else{
                current = current.next;
            }
        }
        return current;
    }
    public Link delete(int key) {
        Link current = first;
        Link previous = first;
        while(current.iData!=key) {
            if(current.next == null){
                return null;
            }else{
                previous = current;
                current = current.next;
            }
        }
        if(current ==first) {
            first = first.next;
        }else{
            previous.next = current.next;
        }
        return current;
    }

}