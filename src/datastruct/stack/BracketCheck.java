/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

/**
 * @author Zen
 * @version 1.0: BracketMatchingStack.java, v 0.1 2019/11/08 22:58 Zen Exp $
 */
public class BracketCheck {
    private String input;
    public BracketCheck(String in){
        input = in;
    }

    /**
     * ����ƥ����
     * switch()���������ʱ�򲻼ǵ�զ��
     */
    public void check(){
        int size = input.length();
        CharArrayStack stack = new CharArrayStack(size);
        for(int j = 0 ; j < size;j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!stack.isEmpty()){
                        char c = stack.pop();
                        if(ch=='}'&&c!='{'||ch==']'&&c!='['||ch==')'&&c!='('){
                            System.out.println("���Ų�ƥ��");
                        }
                    }
                    break;
                default:
                    break;
            }

        }
        if(!stack.isEmpty()){
            System.out.println("ȱ���ұߵ�����");
        }
    }
}