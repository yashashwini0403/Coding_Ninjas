#include <bits/stdc++.h> 
bool isArmstrong(int num) {
    int count=0;
    int num1=num;
    int num2=num;
    while(num1>0)
    {
        count++;
        num1=num1/10;
    }
    int sum=0;
    while(num2>0)
    {
        int x=num2%10;
        sum+=pow(x,count);
        num2=num2/10;
    }
    if(num==sum)
    {
        return true;
    }
    else
    {
        return false;
    }
}