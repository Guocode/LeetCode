package pro20;

import java.util.Stack;

public class Solution {
	public static void main(String args[]) {
		System.out.println(isValid("()"));
	}
    public static boolean isValid(String s) {
        Stack<Character> stk= new Stack<Character>();
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
        		stk.push(s.charAt(i));
        	}
        	else {
        		if(stk.isEmpty()) return false;
        		else {
        			if (s.charAt(i)==')') {if (stk.pop()=='(') continue; else return false; };
        			if (s.charAt(i)==']') {if (stk.pop()=='[') continue; else return false; };
        			if (s.charAt(i)=='}') {if (stk.pop()=='{')   continue; else return false; };
        		}
        	}
        }
    	return (stk.isEmpty());
    }
}
