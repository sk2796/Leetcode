package Easy.newStart;


import java.util.Stack;

public class ValidParanthesis {


    //20. Valid Parentheses
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValid(str));
    }

    private static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        if(str.length()%2==0) {
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)== '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                } else if(!stack.isEmpty()) {
                    if(str.charAt(i)==')' && stack.pop()!='(') {
                        return false;
                    } else if(str.charAt(i)=='}' && stack.pop()!='{') {
                        return false;
                    } else if(str.charAt(i)==']' && stack.pop()!='[') {
                        return false;
                    }
                } else return false;

            }
        } else return false;
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
