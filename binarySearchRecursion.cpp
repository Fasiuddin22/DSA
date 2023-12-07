
#include<bits/stdc++.h>
using namespace std;

int binarySearch(int arr[],int l,int r,int x){
    if(l <= r){
        int m = (l + (r-1))/2;
        if (arr[m] == x)
        {
            return m+1;
        }
        if (arr[m] > x)
        {
            return binarySearch(arr, l, m - 1, x);
        }
        return binarySearch(arr, m + 1, r , x);
        
    }
    return -1;
}

//driver code 
int main(){
    //intialize
    int a[] = {4,7,9,12,56};
    int x = 12;
    int n = sizeof(a)/sizeof(a[0]);

    int result = binarySearch(a,0,n-1,x);
    (result == -1)
        ? cout << "NOT PRESENT IN THE ARRAY "
        : cout << "PRESNT AT POSITION " << result;
    return 0;
}