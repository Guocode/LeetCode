package pro27;

public class Solution {
    public int removeElement(int[] nums, int val) {
    	int tail = nums.length;
    	int i = 0,head =0;
        while(i<tail) {
        	if(nums[i]!=val) {
        		int temp = nums[head];
        		nums[head]=nums[i];
        		nums[i]=temp;
        		head++;
        	}
        	i++;
        }
        return head;
    }
}
