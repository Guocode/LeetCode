package pro34;

import java.util.Arrays;

public class Solution {
	public int[] searchRange(int[] nums, int target) {
		int a = Arrays.binarySearch(nums, target);
		if (a < 0)
			return new int[] { -1, -1 };
		int[] result = new int[2];
		result[0] = a;
		result[1] = a;
		while (result[0] > 0 || result[1] < nums.length - 1) {
			if (result[0] > 0&&nums[result[0] - 1] == target) {
				result[0]--;
				continue;
			}
			if (result[1] < nums.length - 1&&nums[result[1] + 1] == target) {
				result[1]++;
				continue;
			}
			break;
		}
		return result;
	}
}
