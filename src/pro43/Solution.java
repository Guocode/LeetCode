package pro43;

import java.util.Arrays;

public class Solution {
	public static void main(String args[]) {
		System.out.println(multiply("123","456"));
	}
    public static String multiply(String num1, String num2) {
    	int [] result = new int[num1.length()+num2.length()];
    	if(num1.length()>num2.length()) {
    		for(int i =num2.length()-1;i>=0;i--) {
    			traceback(result,num1,num2.charAt(i),i);
    		}
    	}
    	else {
    		for(int i =num1.length()-1;i>=0;i--) {
    			traceback(result,num2,num1.charAt(i),i);
    		}
    	}
    	StringBuffer ret = new StringBuffer();
    	for(int i =0;i<result.length;i++) {
    		if(i==0 &&result[0]==0)continue;
    		ret.append(result[i]);
    	}

    	return ret.toString();
    }
    public static void traceback(int[] result,String num,char a, int i) {//i=num2.length()-1~0 numlength=num1
    	int jinwei = 0;
    	for(int j=num.length();j>0;j--) {
    		int temp = result[j+i]+Integer.parseInt(Character.toString(a))*Integer.parseInt(Character.toString(num.charAt(j-1)))+jinwei;
    		if(result[j+i]+Integer.parseInt(Character.toString(a))*Integer.parseInt(Character.toString(num.charAt(j-1)))+jinwei>9) {
    			//System.out.println(temp);
    			result[j+i]=(result[j+i]+Integer.parseInt(Character.toString(a))*Integer.parseInt(Character.toString(num.charAt(j-1)))+jinwei)%10;
    			jinwei=temp/10;
    		}
    		else {
    			result[j+i]+=Integer.parseInt(Character.toString(a))*Integer.parseInt(Character.toString(num.charAt(j-1)))+jinwei;
    			jinwei=0;
    		}
    	}
    	result[i]+=jinwei;
    }
}
