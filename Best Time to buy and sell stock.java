import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
       int n=prices.size();
       int mini=prices.get(0);
       int maxi=0;
       for(int i=0;i<n;i++)
       {
           int diff=prices.get(i)-mini;
           maxi=Math.max(maxi,diff);
           mini=Math.min(mini,prices.get(i));
       }
       return maxi;
    }
}
