package datastruct.stack;

/**
 * @author Zen
 * @version 1.0: Stack.java, v 0.1 2019/11/08 21:57 Zen Exp $
 */
public interface Stack {
    /**
     * ����
     * @return
     */
    public long peek();

    /**
     * ��ջ
     * @param value
     */
    public void push( long value);

    /**
     * ��ջ
     * @return
     */
    public long pop();

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
