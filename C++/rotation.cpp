#include<bits/stdc++.h>
using namespace std;
int main(){
    int k,n ;
    cin >> n >> k;
    k = k %n;
    cin.ignore();
    string s;
    getline(cin,s);
    string l = "";
    for(int i = 0; i < n ; i++){
        l = s.substr(k) + s.substr(0,k);
    }
    string r = "";
    for(int i = 0; i < n ; i++){
        r = s.substr(n-k) + s.substr(0,n-k);
    }
    cout << l << endl << r;

}