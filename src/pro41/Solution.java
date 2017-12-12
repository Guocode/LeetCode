package pro41;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public int firstMissingPositive(int[] nums) {
		if (nums.length==0) return 1;
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			mp.put( nums[i],i);
		}
		if (max <= 0) {
			return 1;
		}
		for (int i = 1; i < max; i++) {
			if (!mp.containsKey(i)) {
				return i;
			}
		}
		return max + 1;
	}
}
