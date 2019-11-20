/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.sort;

/**
 * @author Zen
 * @version : ShellArray.java, v 0.1 2019/11/20 21:01 Zen Exp $
 */
public class ShellArray {
    private long [] arr;
    private int nElems;
    public ShellArray(int max) {
        arr = new long[max];
        nElems = 0;
    }
    public void insert(long value) {
        arr[nElems++] = value;
    }
    public void display(){
        System.out.println("A= ");
        for( int j = 0; j <nElems;j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    public void shellSort(){
        int inner;
        int outer;
        long temp;
        // h = h * 3 +1 ��Ҫ����
        int h = 1 ;
        while(h <= nElems/3) {
            //1 4 13 40
            h = h * 3 + 1 ;
        }
        //�����10�������� ��ôh = 40

        //ѭ��������м����������
        while(h > 0) {
            //���м������
            for(outer = h ; outer <nElems;outer++){
                temp = arr[outer];
                inner = outer;
                while(inner > h -1 && arr[inner-h] >= temp) {
                    arr[inner] = arr[inner-h];
                    inner -= h;
                }
                arr[inner] = temp;
            }
            h = (h-1)/3;
        }

    }
}