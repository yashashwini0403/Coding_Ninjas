import java.util.* ;

import java.io.*; 

public class Solution{

    public static int fibonacciNumber(int n){
        if (n <= 1)    
        return n;
        int a=0, b=1, mod=1000000007;
        for(int i=2; i<=n; i++){

            int temp = a+b;

            a=b;
            b=temp;
            if(b>=mod)

            b=b-mod;

        }
        return b;
    }

 

}

