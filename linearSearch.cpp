#include<bits/stdc++.h>
using namespace std;

int linearSearch(int arr[],int N,int x){
    for (int i = 0; i < N; i++ )
    {
        if(arr[i] == x){
            return i+1;
        }
    }
    return -1;
}

int main(){
    //intialize
    int a[] = {8,65,4,3,3,9,7,1};
    int x = 3;
    int n = sizeof(a)/sizeof(a[0]);

    int result = linearSearch(a,n,x);
    (result == -1)
        ? cout << "NOT PRESENT IN THE ARRAY "
        : cout << "PRESNT AT POSITION " << result;
    return 0;
}

/* time complexity  :
        best case : o(1)
        average case : o(N)
    space complexity : o(1)
*/