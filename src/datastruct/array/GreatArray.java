/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

/**
 * @author Zen
 * @version 1.0: GreatArray.java, v 0.1 2019/11/06 21:33 Zen Exp $
 */
public class GreatArray {
    /**
     * ���ݴ洢�ṹ
     */
    private long [] arr;
    /**
     * ͳ��Ԫ�ظ���
     */
    private int nElems;
    /**
     * ���췽�� ��ʼ������
     * @param maxsize
     */
    public GreatArray(int maxsize){
        arr = new long[maxsize];
        nElems = 0;
    }

    /**
     * ����Ԫ��
     * @param searchKey
     * @return
     */
    public boolean find(long searchKey) {
        int j;
        for( j = 0; j < nElems ; j++) {
            if(arr[j] == searchKey) {
                break;
            }
        }
        if(j == nElems) {
            return false;
        }else{
            return true;
        }
    }

    /**
     * ����Ԫ��
     * @param value
     */
    public void insert(long value) {
        arr[nElems++] = value;

    }

    /**
     * ɾ��Ԫ��
     * @param value
     * @return
     */
    public boolean delete(long value){
        int j;
        for(j = 0 ;j <nElems ; j++){
            if(arr[j] == value){
                break;
            }
        }
        if(j == nElems){
            return false;
        }else{
            for(int k = j ; k < nElems ; k++) {
                arr[k] = arr[k+1];
            }
            nElems--;
            return true;
        }
    }

    /**
     * չʾ����
     */
    public void display(){
        int j;
        for(j = 0 ; j < nElems ; j ++){
            System.out.print("  " + arr[j] +"  ");
        }
        System.out.println();
    }
}