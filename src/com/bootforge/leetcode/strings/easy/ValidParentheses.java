package com.bootforge.leetcode.strings.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ValidParentheses {
    static void main(String[] args) {
        String[] inputs = {"()", "()[]{}", "(]", "([])", "([)]"};
        for (String input : inputs) {
            System.out.println(input + " -> " + isValidParenthesesOptimized(input));
        }
    }

    private static boolean isValidParenthesesOptimized(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            switch (c) {
                case '(', '[', '{' -> deque.push(c);

                case ')' -> {
                    if (deque.isEmpty() || deque.pop() != '(') {
                        return false;
                    }
                }
                case ']' -> {
                    if (deque.isEmpty() || deque.pop() != '[') {
                        return false;
                    }
                }
                case '}' -> {
                    if (deque.isEmpty() || deque.pop() != '{') {
                        return false;
                    }
                }

            }
        }
        return deque.isEmpty();
    }

    private static boolean isValidParentheses(String str) {
        char[] ch = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : ch) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                char top = stack.pop();
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
