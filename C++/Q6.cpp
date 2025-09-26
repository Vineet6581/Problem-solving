#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0; i< n; i++){
        cin >> arr[i];
    }
    //cin.ignore();
    string s[n];
    //getline(cin,s);
    for(int i = 0; i< n; i++){
        cin >> s[i];
    }

    for(int i = 0; i < n;i++){
        int k=abs(arr[i])%s[i].size();
        int len=s[i].size();
        if(arr[i] < 0){
            cout << s[i].substr(k)+s[i].substr(0,k) << endl;
        } else {
            
            cout << s[i].substr(len-k) + s[i].substr(0,len-k) << endl;
        }
    }
}