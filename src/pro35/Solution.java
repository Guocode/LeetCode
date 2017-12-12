package pro35;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int head = 0,tail = nums.length-1;
        while(head<tail-1) {
        	int mid = (head+tail)/2;
        	if(nums[mid]>target) {tail = mid;}
        	else if (nums[mid]<target) {head = mid;}
        	else return mid;
        }

        if(nums[head]==target)return head;
        else return tail;
    }
}
