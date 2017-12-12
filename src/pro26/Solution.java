package pro26;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		int[] nums = {1,1,2};
		System.out.println(removeDuplicates(nums));
	}
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len==0)return 0;
        int newlen = 1;

        for(int i=1;i<len;i++) {
        	if (nums[i]!=nums[i-1]) {nums[newlen]=nums[i];newlen++;}
           
        }
        return newlen;
    }
}
