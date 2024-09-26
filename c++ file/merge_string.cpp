// MERGE STRING ALTERNATELY
#include <bits/stdc++.h> 
using namespace std; 
 
string merge(string s1, string s2) 
{  
	string result = ""; 
	for (int i = 0; i < s1.length() || 
					i < s2.length(); i++) 
	{  
		if (i < s1.length()) 
			result += s1[i]; 
		if (i < s2.length()) 
			result += s2[i]; 
	} 
	return result; 
} 

// Driver code 
int main() 
{
    string s1,s2;
	// string s1 = "geeks"; 
	// string s2 = "forgeeks";
    cout << "enter the strings to merge: " << endl;
    cin >> s1 >> s2 ;
    cout << merge(s1, s2); 
  
    return 0;
    
} 

// This code is contributed by gp6 
