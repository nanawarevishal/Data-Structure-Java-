package ProblemStatement;

import java.util.*;
class ReverseString{

    static String reverseSring(String str){

        
        Stack<Character>st = new Stack<>();
        
        for(char ch: str.toCharArray()){
            st.push(ch);
        }
        
        String finalStr = "";

        while(!st.isEmpty()){
            finalStr += st.pop();
        }
        return finalStr;
    }

    public static void main(String[] args) {
        
        System.out.println(reverseSring("abcd"));
    }
}