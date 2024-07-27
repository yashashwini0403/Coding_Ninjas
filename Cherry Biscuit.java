import java.util.* ;
import java.io.*; 

class Solution {

    public static int cherryBiscuit(int A[], int n, int k) {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(A[i]>k)
            {
                count++;
            }
        }
        return count;
    }
}