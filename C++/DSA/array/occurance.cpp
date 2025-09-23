#include<bits/stdc++.h>
using namespace std;
int main(){
    int N;
    cin>>N;
    vector<int> arr(N);
    for(int i = 0; i < N; i++){
        cin >> arr[i];
    }
    int c = count(arr.begin(),arr.end(),1);
    arr.erase(arr.begin()+c);
    for(int i = 0; i < N-1; i++){
        cout << arr[i] << " ";
    }
    return 0;
}