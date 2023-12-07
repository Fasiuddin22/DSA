#include<bits/stdc++.h>
using namespace std;

    vector<int> twosum(vector<int>& nums,int target){
        for (int i = 0; i < nums.size(); i++){
            for (int j = i+1; j < nums.size(); j++){
                if(nums[i] + nums[j] == target){
                    return {i,j};
                }
            } 
        }
        return {};
    }

    
int main()
{
    vector <int> a = {1 , 4 , 5 , 11 , 12};
    int target = 9;
    for(int &x : twosum(a , target))
        cout << x << " ";
    cout << '\n';
}