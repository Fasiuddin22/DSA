// GREATEST COMMON DIVISER OF STRING
#include<bits/stdc++.h>
#include<iostream>
#include<algorithm>
using namespace std;


string gcdOfStrings(string str1, string str2) {
    // Check if they have non-zero GCD string.
    if (str1 + str2 != str2 + str1) {
        return "";
    }
    // Get the GCD of the two lengths.
    int gcdLength = __gcd(str1.size(), str2.size());
    return str1.substr(0, gcdLength);
}

int main(){
     string s1,s2;
	// string s1 = "geeks"; 
	// string s2 = "forgeeks";
    cout << "enter the strings to get gcd: " << endl;
    cin >> s1 >> s2 ;
    cout << gcdOfStrings(s1, s2); 
  
    return 0;
}