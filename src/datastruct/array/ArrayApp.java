/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

/**
 * @author Zen
 * @version 1.0: ArrayApp.java, v 0.1 2019/11/06 20:39 Zen Exp $
 * ������̲�����ʵ��
 */
public class ArrayApp {
    public static void main(String[] args) {
        //��������
        long[] arr;
        //��������
        arr = new long[100];
        //����Ԫ�ظ���
        int nElems=0;
        //��ǰ�±�
        int j;
        //����ֵ
        long searchKey;
        arr[0] = 77;
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        nElems = 7;
        //��ʾ����Ԫ��
        for(j = 0;j < nElems;j++){
            System.out.println(arr[j]);
        }
        //����66
        searchKey = 88;
        for(j = 0;j <nElems ; j++){
            if(arr[j] == searchKey){
                break;
            }
        }
        if(j == nElems){
            System.out.println("Can't find searchKey !" + searchKey);
        }else{
            System.out.println("Found" + searchKey);
        }
        //ɾ��55
        searchKey =55;
        for( j = 0 ; j < nElems ;j++ ){
            if(arr[j] == searchKey){
                break;
            }
        }
        for(int i = j ; i <nElems;i++){
            arr[i] = arr[i+1];
        }
        nElems --;
        //��ʾ����Ԫ��
        for(j = 0;j < nElems;j++){
            System.out.println(arr[j]);
        }

    }
}