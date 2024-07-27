public class Solution {
    public static int totalSteps(int n, int k, int[] flowers) {
        int capacity=k;
        int steps=0;
        for(int i=0;i<flowers.length;i++)
        {
            if(flowers[i]<=capacity)
            {
                capacity-=flowers[i];
                steps++;
            }
            else
            {
                capacity=k;
                capacity-=flowers[i];
                steps+=2*i+1;
            }

        }
        return steps;
    }
}