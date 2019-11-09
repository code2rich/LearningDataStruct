package datastruct.queue;

/**
 * @author Zen
 * @version : Queue.java, v 0.1 2019/11/09 20:36 Zen Exp $
 */
public interface Queue {
    /**
     * ���
     * @param value
     */
    public void insert(long value);

    /**
     * ����
     * @return
     */
    public long delete();

    /**
     * �鿴��ͷ
     * @return
     */
    public long peek();

    /**
     * �Ƿ�Ϊ��
     * @return
     */
    public boolean isEmpty();

    /**
     * �Ƿ�Ϊ��
     * @return
     */
    public boolean isFull();

    /**
     * ����Ԫ�ظ���
     * @return
     */
    public int size();
}
