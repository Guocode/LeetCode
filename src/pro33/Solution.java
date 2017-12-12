package pro33;

import java.util.Arrays;

public class Solution {
    public int search(int[] nums, int target) {
    	int l=0,r=nums.length-1;
    	while(l!=r) {
    		if(nums[(l+r)/2]>nums[l]) {l=(l+r)/2;}
    		else {r=(l+r)/2;}
    	}
    	int a=Arrays.binarySearch(Arrays.copyOf(nums, l), target);
    	if(a>=0) return a;
    	int b =Arrays.binarySearch(Arrays.copyOfRange(nums, l, nums.length), target);
    	return b+l;
    }
}
