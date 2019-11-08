/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

/**
 * @author Zen
 * @version 1.0: StackC.java, v 0.1 2019/11/08 22:31 Zen Exp $
 */
public interface StackC {
    /**
     * ����
     * @return
     */
    public char peek();

    /**
     * ��ջ
     * @param char
     */
    public void push( char c);

    /**
     * ��ջ
     * @return
     */
    public char pop();

    /**
     * �Ƿ�Ϊ��
     * @return
     */
    public boolean isEmpty();

    /**
     * �Ƿ�ջ��
     * @return
     */
    public boolean isFull();
}