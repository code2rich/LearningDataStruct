/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.array;

/**
 * @author Zen
 * @version 1.0: SimpleArray.java, v 0.1 2019/11/06 20:38 Zen Exp $
 */
public class SimpleArray {
    /**
     * �洢���ݵ����� ˽���������� ����������һ����װ��
     */
    private long [] a;

    /**
     * ���캯�� ��������ɴ洢Ԫ�ظ���
     * @param maxsize
     */
    public SimpleArray(int maxsize){
        a = new long[maxsize];
    }

    /**
     * �����������ֵ
     * @param index �±�
     * @param value ��ֵ
     */
    public void setElems(int index,long value) {
        a[index] = value;
    }

    /**
     * ��������ȡֵ
     * @param index �±�
     * @return �±��Ӧ����ֵ
     */
    public long getElems(int index) {
        return a[index];
    }
}