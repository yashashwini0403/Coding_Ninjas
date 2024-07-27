import java.util.ArrayList;

public class Solution {
	public static int findDuplicate(ArrayList<Integer> arr) 
	{ 
		int size = arr.size();
    int ans = 0;
    for(int i=0; i<size; ++i)
    {
        ans = ans^arr.get(i);
    }
    for(int i=0; i<size; ++i)
    {
        ans = ans ^ i;
    }
    return ans;
	}
}