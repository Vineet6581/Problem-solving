#include<bits/stdc++.h>
using namespace std;
int main(){
    int N,M,K;
    cin>>N>>M>>K;
    vector<vector<int>> arr (N,vector<int> (M));
    for(int i = 0; i < N; i++){
        for(int j = 0; j <M; j++){
            cin >> arr[i][j];
        }
    }
    for(int i = 0; i < N/2; i++){
        for(int j = K; j >0; j--){
            swap(arr[i][M-j],arr[N-i-1][K-j]);
        }
        
    }
    for(auto row : arr){
        for(auto col : row){
            cout <<col<< " ";
        }
        cout << endl;
    }
    
}
