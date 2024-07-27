import java.util.*;
import java.io.*;

public class Solution {

    public static boolean perfectNumber(int k) {
        if (k <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i <= Math.sqrt(k); i++) {
            if (k % i == 0) {
                sum += i;
                if (i != k / i) {
                    sum += k / i;
                }
            }
        }

        return sum == k;
    }
}
