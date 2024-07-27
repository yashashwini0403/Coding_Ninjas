import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
public class Solution {
    public static int sparseSearch(ArrayList<String> arr, String k) 
     {
        int ind=0,flag=0;
      for(int i=0;i<arr.size();i++)
      {
          if(arr.get(i).equals(k))
          {
                flag=1;
                ind=i;
                break;
          }
          else
          {
              ind=-1;
          }
      }
      return ind;
    }
}