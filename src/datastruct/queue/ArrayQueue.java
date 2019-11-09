/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.queue;

/**
 * @author Zen
 * @version : ArrayQueue.java, v 0.1 2019/11/09 20:37 Zen Exp $
 * 这种队列有一个问题，就是如果元素个数超过了数组最大个数，会覆盖前面的数据
 * 这里就没有去做细致的限制了
 */
public class ArrayQueue implements Queue{
    private long[] arr;
    private int maxsize;
    private int front;
    private int rear;
    private int nElems;
    public ArrayQueue(int size){
        maxsize = size;
        arr = new long[maxsize];
        front = 0;
        rear = -1;
        nElems = 0;
    }
    @Override
    public void insert(long value) {
        if(rear == maxsize - 1){
            rear = -1;
        }
        arr[++rear] = value;
        nElems++;
    }

    @Override
    public long delete() {
        long temp = arr[front++];
        if(front == maxsize){
            front = 0;
        }
        nElems--;
        return temp;
    }

    @Override
    public long peek() {
        return arr[front];
    }

    @Override
    public boolean isEmpty() {
        return nElems==0;
    }

    @Override
    public boolean isFull() {
        return nElems==maxsize;
    }

    @Override
    public int size() {
        return nElems;
    }
}