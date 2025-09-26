#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    string s;
    cin >> s;
    string l = s;
    reverse(s.begin(),s.end());
    if(l == s){
        cout<<"True";
    }else{
        cout<<"False";
    }
}