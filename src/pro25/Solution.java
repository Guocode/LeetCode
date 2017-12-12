package pro25;

import java.util.Stack;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
       // if(head == null) return null;
      //  if(head.next == null ) return head;
        ListNode result = head;
        int k_cur = k;
        while(k_cur!=1) {//result置为第k个节点 保证前k个节点不为null 否则return head
        	if(result.next!=null) {
        	result = result.next;}
        	else return head;
        	k_cur --;
        }
    	

        Stack<ListNode> stk = new Stack<ListNode>();
        boolean flag_con = true;
        while(flag_con){
            k_cur = k;
            while(k_cur!=0) {//入栈1-k head->k+1
            	if(head.next!=null) {
            	stk.push(head);
            	head = head.next;}
            	else flag_con = false;
            	k_cur --;
            }
            if(flag_con) {//如果满k
            k_cur = k;}
            else break;
            while(k_cur!=1) {//出栈next调整
            	stk.pop().next=stk.peek();
            	k_cur --;
            }
            k_cur = k;
            while(k_cur!=1) {
            	if(result.next!=null) {
            	result = result.next;}
            	else return head;
            	k_cur --;
            }
            stk.pop().next=head;//
        }
        return result;
    }
}