package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValidWithStack("))"));
        //System.out.println(isValidNew("[()[[{}]]()]"));
    }
    public static boolean isValidWithStack(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }   else if (!stack.isEmpty()) {
                if (s.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                }   else if (s.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                }   else if (s.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                }   else return false;
            }   else return false;
        }
        return stack.isEmpty();
    }

    public static boolean isValidNew(String s) {
        //String s = s;
        while (s.contains("[]") || s.contains("{}") || s.contains("()")) {
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            s = s.replace("()", "");
        }
            return s.isEmpty();
    }
}
