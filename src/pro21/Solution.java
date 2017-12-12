package pro21;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(0);
        ListNode result = newNode.next;
        while(l1!=null||l2!=null) {
        	if(l1==null) {
        		newNode.next = l2; 
        		l2=l2.next;
        		continue;
        	}
        	if(l2==null) {
        		newNode.next = l1;
        		l1=l1.next; 
        		continue;
        	}
    	  //  if(l1==null)newNode = l2; l2=l2.next; continue;
        	//if(l2==null) {newNode = l1; l1=l1.next; continue;}
        	if(l1.val<l2.val) {
        		newNode = l2; l2=l2.next;}//l2大
        	else {
        		newNode= l1; l2=l2.next;}
        	newNode= newNode.next;
        }
        return result;
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
