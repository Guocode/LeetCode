import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.math.*;

public class aaa {
	public static void main(String args[]) {
		//int a[] = { -1, 2, 1, -4 };
		//System.out.println(threeSumClosest(a, 1));
		ListNode head = new ListNode(1);
		head.next =new ListNode(2);
		head.next.next= new ListNode(3);
		head.next.next.next= new ListNode(4);
		System.out.println(removeNthFromEnd(head,1).val);
	}
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h1=head, h2=head;
        while(n-->0) h2=h2.next;
        if(h2==null)return head.next;  // The head need to be removed, do it.
        h2=h2.next;
        
        while(h2!=null){
            h1=h1.next;
            h2=h2.next;
        }
        h1.next=h1.next.next;   // the one after the h1 need to be removed
        return head;
    	}
    
	public static int threeSumClosest(int[] nums, int target) {
		// if
		Arrays.sort(nums);
		int dis = Integer.MAX_VALUE;// 距离
		for (int i = 0; i < nums.length - 2; i++) {
			int l = i + 1;
			int r = nums.length - 1;
			int target0 = target - nums[i];
			while (l < r) {
				if (nums[l] + nums[r] == target0)
					return target;
				if (nums[l] + nums[r] > target0) {
					if (Math.abs((nums[l] + nums[r] - target0)) < Math.abs(dis)) {
						dis = nums[l] + nums[r] - target0;
					}
					r--;
				}
				if (nums[l] + nums[r] < target0) {
					if (Math.abs((nums[l] + nums[r] - target0)) < Math.abs(dis)) {
						dis = nums[l] + nums[r] - target0;
					}
					l++;
				}
			}
		}
		return dis+target;
	}
    public static List<String> letterCombinations(String digits) {
    	//ArrayList<String> ans0 = new ArrayList<String>();
    	//ans0.re
        List<String> ans = new ArrayList<String>();
        if(digits=="")return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
       
        for(int i =0; i<digits.length();i++){					//第i个digits的对应String的每个字母遍历增加到已有的
            int x = Character.getNumericValue(digits.charAt(i));//第i个digits字母变为数字
            while(ans.get(0).length()==i){						//当ans的第一个元素长度等于i 即还有元素 否则不断弹出 即弹出所有元素
                String t = ans.remove(0);						//弹出ans的第一个元素
                for(char s : mapping[x].toCharArray())			//对弹出的这个元素附上每个新来的i对应的String
                    ans.add(t+s);
            }
        }
        return ans;
    }

}
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }