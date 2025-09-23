#include <bits/stdc++.h>
using namespace std;
int main(){
    // int(s[i]) or static_cast <int> (s[i])
    int n,k;
    cin >> n >> k;
    cin.ignore();
    string s,l;
    getline(cin,s);
    for(int i = 0; i < n; i++){
       l = s.substr(k,n-2*k);
    }
    cout << l;
}
