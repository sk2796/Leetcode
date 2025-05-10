package Easy;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "((";
        boolean val = isValidPT(s);
        System.out.println(val);

    }

    private static boolean isValidPT(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length()%2!=0) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='(' || s.charAt(i) == '{' || s.charAt(i)=='[') {
                    st.push(s.charAt(i));
                }
                if(st.size()==0) {
                    return false;
                } else {
                    if(s.charAt(i) == ')' && st.pop()!='(') {
                        return false;
                    }
                    if(s.charAt(i) == '}' && st.pop()!='{') {
                        return false;
                    }
                    if(s.charAt(i) == ']' && st.pop()!='[') {
                        return false;
                    }
                }
            }
            if(st.size()>0) {
                return false;
            }
        }
        return true;
    }
}
