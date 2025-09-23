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
    for(int i = 0; i < N-1; i++){
        for(int j = 0; j < M-1; j++){
            swap(arr[i][j],arr[i+1][j+1]);
        }
        
    }
    for(auto row : arr){
        for(auto col : row){
            cout <<col<< " ";
        }
        cout << endl;
    }
    
}
