package pro28;
//28
public class Solution {
    public int strStr(String haystack, String needle) {
    	if(needle=="")return 0;
        char[] harr= haystack.toCharArray();
        char[] narr= needle.toCharArray();
        int hlen= harr.length;
        int nlen=  narr.length;
        boolean flag = false;
        int result = -1;
        for (int i = 0;i<hlen-nlen;i++) {
        	for(int j = 0;j<nlen;j++) {
        		if(narr[j]==harr[i+j]) {flag = true;}
        		else {flag = false ;break;}
        	}
        	if(flag) {result = i;break;}
        }
        return result;
    }
}
