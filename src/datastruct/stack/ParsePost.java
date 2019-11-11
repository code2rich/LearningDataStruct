/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

/**
 * @author Zen
 * @version : ParsePost.java, v 0.1 2019/11/11 20:29 Zen Exp $
 */
public class ParsePost {
    private LongArrayStack stack;
    private String input;
    public ParsePost(String s ) {
        input = s;
    }

    public int doParse() {
        stack = new LongArrayStack(20);
        char ch ;
        int j ;
        int num1,num2,interAns;
        for( j = 0 ; j < input.length() ; j ++) {
            ch = input.charAt(j);
            if(ch > '0' && ch <= '9'){
                stack.push((int)(ch -  '0'));
            }else {
                num2 = (int)stack.pop();
                num1 = (int)stack.pop();
                switch (ch) {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                stack.push(interAns);
            }
        }
        interAns = (int)stack.pop();
        return interAns;
    }
}