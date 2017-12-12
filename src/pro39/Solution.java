package pro39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Solution {
	public static void main(String args[]) {
		List<Integer> t = new ArrayList<Integer>();
		t.add(2);
		t.add(3);
		t.add(4);
		int[] nums = {2,3,6,7};
		int target = 7;
		System.out.println(subsets(nums,target));
	}
	public static List<List<Integer>> subsets(int[] nums,int target) {
	    List<List<Integer>> list = new ArrayList<>();
	    Arrays.sort(nums);
	    backtrack(list, new ArrayList<>(), nums, target,0);
	    return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
	    if(remain < 0) return;
	    else if(remain == 0) list.add(new ArrayList<>(tempList));
	    else{ 
	        for(int i = start; i < nums.length; i++){
	            tempList.add(nums[i]);
	            backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
	            tempList.remove(tempList.size() - 1);
	        }
	    }
	}
	public static int sumarr(List<Integer> t) {
		if(!t.isEmpty()) {
			return t.remove(0)+sumarr(t);
		}
		return 0;
	}
}
