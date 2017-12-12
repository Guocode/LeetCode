package pro22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static void main(String args[]) {
		System.out.println(generateParenthesis(3));
	}
	public static List<String> generateParenthesis(int n) {
		LinkedList<String> ls = new LinkedList<String>();
		String or = "";
		ls.add(or);
		for (int i = 0; i < 2*n; i++) {
			LinkedList<String> lst = new LinkedList<String>();
			while (ls.peek() != null) {
				String temp=ls.pop();//弹出
				if(i==2*n-1) {lst.add(temp+")");continue;}
				int lnum = 0,rnum =0;//左括号个数和右括号个数
				for(int j=0;j<temp.length();j++) {
					if(temp.charAt(j)=='(') lnum++;
					else rnum++;
				}
				if(lnum==n) {lst.add(temp+")");}
				else if(lnum>=rnum+1) {lst.add(temp+"(");lst.add(temp+")");}
				else  {lst.add(temp+"(");}
			}
			ls=lst;
		}
		return ls;
	}
}
