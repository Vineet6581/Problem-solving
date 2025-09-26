// s.substr(k)  + s.substr(0,k) --> left rotation by k
// s.substr(n-k) + s.substr(0,n-k) --> right rotation by k
#include<bits/stdc++.h>
using namespace std;
int main(){
    int k,n ;
    cin >> n >> k;
    cin.ignore();
    string s;
    getline(cin,s);
    string l = "";
    for(int i = 0; i < n ; i++){
        l = s.substr(k) + s.substr(0,k);
    }
    cout << l;
}