package pro38;

public class Solution {
	public String countAndSay(int n) {
		String result = "1";
		StringBuffer x = new StringBuffer();
		while (n != 1) {
			int count = 1;
			for (int i = 0; i < result.length() - 1; i++) {
				if (result.charAt(i) == result.charAt(i + 1)) {
					count++;
				} else {
					x.append(Integer.toString(count));
					x.append(result.charAt(i));
					count = 1;
				}
			}
			x.append(Integer.toString(count));
			x.append(result.charAt(result.length() - 1));
			result = x.toString();
			x.setLength(0);
			n--;
		}
		return result;
	}
}
