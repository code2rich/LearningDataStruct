/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

/**
 * @author Zen
 * @version 1.0: SortedArray.java, v 0.1 2019/11/06 22:22 Zen Exp $
 */
public class SortedArray {
    private long[] arr;
    private int nElems;

    /**
     * ���캯��
     * @param maxsize
     */
    public SortedArray(int maxsize){
        arr = new long[maxsize];
        nElems = 0;
    }

    /**
     * �鿴������
     * @return
     */
    public int size(){
        return nElems;
    }

    /**
     * ����ֵ������λ�õ�ֵҪ�����ƶ�һλ
     * @param value
     */
    public void insert(long value) {
        int j;
        for(j = 0 ; j < nElems ; j++) {
            if(arr[j] > value){
                break;
            }
        }
        for(int k = nElems;k > j ; k-- ){
            arr[k] = arr[k-1];
        }
        arr[j] = value;
        nElems++;
    }

    /**
     * ��ʾ����
     */
    public void display(){
        for(int j = 0; j < nElems ;j++){
            System.out.print(" " + arr[j] + "  ");
        }
        System.out.println();
    }
    public int find(long searchKey) {
        int begin = 0;
        int end = nElems - 1;
        int mid ;
        while(true) {
            mid = (begin + end)/2;
            if(arr[mid] == searchKey){
                return mid;
            }else if(begin > end ){
                //���ش����������������
                return nElems;
            }else {
                if(arr[mid] < searchKey){
                    begin = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
    }
    public int findRec(long searchKey) {
        return recFind(searchKey,0,nElems-1);
    }
    /**
     * ���ֲ���
     * �����㷨
     * @param searchKey
     * @param lowerBound
     * @param upperBound
     * @return
     */
    private int recFind(long searchKey , int lowerBound , int upperBound) {
        int curIn;
        curIn = (lowerBound+upperBound)/2;
        if(arr[curIn] == searchKey){
            return curIn;
        }else if(lowerBound > upperBound){
            return nElems;
        }else{
            /*
            * �����㷨
            * */
            if(arr[curIn] < searchKey) {
                return recFind(searchKey,curIn+1,upperBound);
            }else{
                return recFind(searchKey,lowerBound,curIn-1);
            }
        }
    }


    /**
     *
     * @param value
     * @return
     */
    public boolean delete(long value) {
        int j = find(value);
        if(j == nElems) {
            return false;
        }else{
            for(int k = j ; k < nElems;k++){
                arr[k] = arr[k+1];
            }
            nElems--;
            return true;
        }
    }
}