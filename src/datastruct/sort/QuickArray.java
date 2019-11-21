/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version : QuickArray.java, v 0.1 2019/11/20 21:44 Zen Exp $
 */
public class QuickArray {
    private long[] arr;
    private int nElems;
    public QuickArray(int max) {
        arr = new long[max];
        nElems = 0;
    }
    public void insert(long value) {
        arr[nElems++] = value;
    }
    public int size() {
        return nElems;
    }
    public void display(){
        System.out.println(" A = " );
        for( int j = 0 ; j < nElems ; j ++) {
            System.out.print(arr[j] + "  ");
        }
        System.out.println();
    }
    /**
     * ����
     */
    public int partitionIt(int left ,int right , long pivot){
        int leftPtr = left - 1 ;
        int rightPtr = right + 1;
        while(true) {
            //��������С���ض�ֵ��������
            //ѭ��������һ�������
            while(leftPtr < right && arr[++leftPtr] < pivot){}
            //ѭ�������ʹ����ҵ���һ�������ض�ֵ��������
            while(rightPtr > left && arr[--rightPtr] > pivot){}
            //ѭ�������ʹ����ҵ���һ��С���ض�ֵ��������
            if(leftPtr >= rightPtr ){
                break;
            }else{
                swap(leftPtr,rightPtr);
            }
        }
        return  leftPtr;
    }
    public void swap(int dex1 , int dex2) {
        long temp;
        temp = arr[dex1];
        arr[dex1] = arr[dex2];
        arr[dex2] = temp;
    }

    public void quickSort(){
        recQuick(0,nElems-1);
    }

    /**
     * �õݹ�ͻ��ּ������п�������
     * @param left
     * @param right
     */
    private void recQuick(int left , int right){
        if(right - left <= 0) {
            return;
        }else{
            //ȡ�ָ���ֵ ����ȡ��������ֵ
            long pivot = arr[right];
            int partition = partitionIt(left,right,pivot);
            recQuick(left,partition-1);
            recQuick(partition,right);
        }

    }

}