/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.link;

/**
 * @author Zen
 * @version : SortedLinkList.java, v 0.1 2019/11/13 22:11 Zen Exp $
 */
public class SortedLinkList {
    private Link first;
    public SortedLinkList(){
        first = null;
    }
    public void insert(int id ,double dd){
        Link newLink = new Link(id,dd);
        Link previous = null;
        Link current = first;
        while(current!=null && id > current.dData) {
            previous = current;
            current = current.next;
        }
        if(previous==null) {
            first = newLink;
        }else{
            previous.next = newLink;
        }
        newLink.next = current;
    }

    public Link remove(){
        Link temp =first;
        first = first.next;
        return  temp;
    }
    public void displayLinkList(){
        System.out.println("¥Ú”°”––Ú¡¥±Ì");
        Link current = first;
        while(current!= null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}