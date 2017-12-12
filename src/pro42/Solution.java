package pro42;

import java.util.Arrays;

public class Solution {
	public  static void  main(String args[]) {
		int [] a = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(a));
	}
    public static int trap(int[] height) {
    	int tail = height.length-1;
    	if(tail<=1) {return 0;}
      	int result = 0;
    	while(tail>1) {
    		if(height[tail]<=height[tail-1]) {
    			tail--;
    			continue;
    		}
    		break;
    	}
    	int m = maxarr(Arrays.copyOf(height, tail),height[tail]);//m应该选往左第一个比tail大的
    	int hh = height[m]<height[tail]?height[m]:height[tail];
        for(int i =m+1;i<tail;i++) {
        	result +=hh-height[i];
        }
        return result + trap(Arrays.copyOf(height, m+1));
    }
    public static int maxarr(int []arr,int mm) {
    	int max = 0;
    	for (int i=arr.length-1;i>0;i--) {
    		if(arr[i]>=mm) return i;
    		if(arr[i]>arr[max]) {
    			max = i;
    		}
    	}
    	return max;
    }
}
