#include <bits/stdc++.h> 

int fishEater(vector<int> &fishes) {

    int size = fishes.size();

    int max =fishes[0];

    int count=size;
    for(int i=1;i<size;i++){

        if(max > fishes[i]){
            count--;
        }
        else
        {
            max = fishes[i];
        }
    }
    return count;

}