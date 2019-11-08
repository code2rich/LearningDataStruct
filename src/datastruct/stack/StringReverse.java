/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package datastruct.stack;

/**
 * @author Zen
 * @version 1.0: StringReverse.java, v 0.1 2019/11/08 22:39 Zen Exp $
 */
public class StringReverse {
    private String input;
    private String output;
    public StringReverse(String in){
        input = in ;
    }
    public String doRev(){
        int size = input.length();
        CharArrayStack stack = new CharArrayStack(size);
        for(int j = 0; j < size ;j++) {
            char ch=input.charAt(j);
            stack.push(ch);
        }
        output = "";
        while(!stack.isEmpty()){
            char c = stack.pop();
            output = output+c;
        }
        return output;
    }
}