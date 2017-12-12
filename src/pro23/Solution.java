package pro23;

import java.util.Arrays;
import java.math.*;
public class Solution {
	public static void main(String args[]) {
		ListNode no1 = new ListNode(0);
		ListNode no2 = new ListNode(1);
		ListNode[] lists = new ListNode[] {no1 ,no2};
		System.out.println(mergeKLists(lists));
	}
    public static  ListNode mergeKLists(ListNode[] lists) {
    	if(lists.length==0) return null;
    	if(lists.length==1) return lists[0];
    	int peek[]= new int [lists.length];
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        boolean fal = false;
        for(int i=0;i<lists.length;i++) {
        	if(lists[i]!=null) {fal=true;peek[i]=lists[i].val;}
        	else {peek[i]=Integer.MAX_VALUE;continue;}
        	//////////////
        }
        while(fal)//
        {
        	//int a = minarr(peek);
        	//int b = Arrays.binarySearch(peek, a);

        	int j =  minarr(peek);
        	//找出peek中最大的值
        	temp.next = lists[j];
        	lists[j] = lists[j].next;
        	temp= temp.next;
        	if(lists[j]==null) {peek[j]=Integer.MAX_VALUE;}
        	else {peek[j] = lists[j].val;} 	
        	fal = false;
        	for(int i=0;i<lists.length;i++) { //不全为null
        		if(lists[i]!=null) {fal=true;break;}
        	}
        }
        return result.next;
    }
    public static  int minarr(int in[]) {
    	if (in.length==1) return in[0];
    	
    	int mm= Math.min(minarr(Arrays.copyOfRange(in, 0, in.length/2)), minarr(Arrays.copyOfRange(in, in.length/2,in.length)));
    	for(int i=0;i<in.length;i++) {
    		if(in[i]==mm) 
    			return i ;
    	}
		return 0;
    }

}
class ListNode {
    int val;
    ListNode next;
     ListNode(int x) { val = x; }
 }