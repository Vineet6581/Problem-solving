#include<bits/stdc++.h>
using namespace std;
int main(){
    int m,n,k;
    cin >> m >> n >>k;
    string s1,s2;
    cin >> s1;
    cin >> s2;
    s1 = s1.substr(m-k%m) + s1.substr(0,m-k%m);
    s2 = s2.substr(k%n) + s2.substr(0,k%n);
    string s3 = "";
    s3 = s1 + s2;
    string l = s3;
    reverse(s3.begin(),s3.end());
    if(s3 == l){
        cout << l << " "<<"True";
    }else{
        cout << l << " "<< "False";
    }
}