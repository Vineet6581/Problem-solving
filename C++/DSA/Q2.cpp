#include<bits/stdc++.h>
using namespace  std;
int main(){
    string str;
    cin >> str;
    for(int i = 0; i<str.length();i++){
        if(str[i] == 'o'){
            str[i] = ' ';
        }
    }
    cout << str;
}