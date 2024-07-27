import java.util.* ;
import java.io.*; 

public class Solution {

	public static int getMaximumHouses(int k, int l) {
		double b=Math.pow(2,l);
		int a=(int)b;
		int ans=a-k;
		return ans;
	}

}