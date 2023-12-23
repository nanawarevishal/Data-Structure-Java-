package ProblemStatement;

import java.util.Stack;

class ParenthesisChecker{

    static boolean isValidParenthesis(String str){

        Stack<Character>st = new Stack<>();
        for(char ch : str.toCharArray()){

            if(ch == '{' || ch =='[' || ch =='('){
                st.push(ch);
            }

            else{

                if(st.isEmpty()){
                    return false;
                }

                char ch1 = st.pop();

                if(ch1=='[' && ch==']' || ch1=='{' && ch=='}' || ch1=='(' && ch==')' ){
                    continue;
                }

                else{
                    return false;
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "()[]{}";

        System.out.println(isValidParenthesis(s));
    }
}
