#include<bits/stdc++.h>
using namespace std;

int binarySearch(int arr[],int l,int r,int x){
    while(l <= r){
        int m = (l + (r-1))/2;
        if (arr[m] == x)
        {
            return m+1;
        }
        if (arr[m] < x)
        {
            l = m + 1;
        }
        else
        {
            r = m - 1;
        }
        
    }
    return -1;
}

//driver code 
int main(){
    //intialize
    int a[] = {8,65,4,3,3,9,7,1};
    int x = 3;
    int n = sizeof(a)/sizeof(a[0]);

    int result = binarySearch(a,0,n-1,x);
    (result == -1)
        ? cout << "NOT PRESENT IN THE ARRAY "
        : cout << "PRESNT AT POSITION " << result;
    return 0;
}