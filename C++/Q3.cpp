#include <bits/stdc++.h>
using namespace std;
int main(){
    // int(s[i]) or static_cast <int> (s[i])
   int n;
   cin>>n;
   cin.ignore();
   string s;
   getline(cin,s);
   int max = int(s[0]);
   int loc = 0;
   for(int i = 1; i < s.size(); i++){
       if(max < int(s[i])){
           max = int(s[i]);
       }
   }
   cout << (char)max << " " << max;
}
