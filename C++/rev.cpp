// reverse(s.begin() , s.end())

#include<bits/stdc++.h>
using namespace std;
int main(){
    int n , k;
    cin >> n >> k;
    string s,res  = "";
    cin >> s;
    for(int i = 0; i < n ; i+=2*k){
        string part=s.substr(i,k);
        string part2=s.substr(i+k,k);
        reverse(part2.begin(),part2.end());
        res += part+part2;
    }
    cout << res;
}