#include <bits/stdc++.h>
using namespace std;
int main(){
    string a,b,c;
    getline(cin,a);
    getline(cin,b);
    int n;
    cin >> n;
    for(int i = 0; i < a.size(); i++){
        if(i%2 == 0 && i != 0){
            c +=  b;
        }
        c += a[i];
    }
    cout << c;
}

