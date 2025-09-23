#include <bits/stdc++.h>
using namespace std;
int main(){
    // int(s[i]) or static_cast <int> (s[i])
    int k,n,m,c;
    cin >> k >> n >> m;
    cin.ignore();
    string s;
    getline(cin,s);
    int count = 0;
    for(int i = 0; i <k; i++){
        c = int(s[i]);
        if(c >= n && c <= m){
            count++;
        }
    }
    cout << count;
}
