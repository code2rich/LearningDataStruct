/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

/**
 * @author Zen
 * @version : InToPost.java, v 0.1 2019/11/09 22:22 Zen Exp $
 * 中缀转后缀(个位数运算)
 */
public class InToPost {
    private CharArrayStack stack;
    private String input;
    private String output="";
    public InToPost(String in) {
        input = in ;
        int size = input.length();
        stack = new CharArrayStack(size);
    }

    /**
     * 符号
     * @param opThis
     * @param precl
     */
    public void getOper(char opThis,int precl){
        while(!stack.isEmpty()) {
            char opTop = stack.pop();
            if(opTop == '(') {
                stack.push(opTop);
            }else{
                int prec2 ;
                if(opTop=='-'||opTop=='+'){
                    prec2 = 1;
                }else{
                    prec2 = 2;
                }
                if(prec2 < precl) {
                    stack.push(opTop);
                    break;
                }else{
                    output = output + opTop;
                }
            }
        }
        stack.push(opThis);
    }
    public void getParen(char c){
        while(!stack.isEmpty()) {
            char chx = stack.pop();
            if(chx == '(') {
                break;
            }else{
                output = output + chx;
            }
        }
    }

    /**
     * 中缀表达式变后缀表达式
     * @return
     */
    public String doTrans(){
        for( int j = 0 ; j < input.length() ; j ++ ) {
            char ch = input.charAt(j);
            stack.displayStack("For" + ch + " ");
            switch (ch) {
                case '+':
                case '-':
                    getOper(ch,1);
                    break;
                case '*':
                case '/':
                    getOper(ch,2);
                    break;
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    getParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while(!stack.isEmpty()){
            stack.displayStack("While ");
            output = output + stack.pop();
        }
        stack.displayStack("End ");
        return output;
    }
}