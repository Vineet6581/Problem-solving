#include<bits/stdc++.h>
using namespace std;
int main(){
    int N,M;
    cin>>N>>M;
    vector<vector<int>> arr (N,vector<int> (M));
    for(int i = 0; i < N; i++){
        for(int j = 0; j <M; j++){
            cin >> arr[i][j];
        }
    }
    if(N<6 && M<6){
        cout << " please enter valid row and column number";
    }
    for(int i= 1; i < N-2 ; i++){
        for(int j = 1; j < M-2 ; j++){
            cout << arr[i][j];
        }
        cout << endl;
    }
}
