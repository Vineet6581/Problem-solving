#include<bits/stdc++.h>
using namespace std;
int main(){
    int M,N;
    cin>>N>>M;
    int arr[N][M];
    for(int i = 0; i < N; i++){
        for(int j =0;j<M; j++){
            cin >> arr[i][j];
        }
    }
    for(int i = 0; i < N; i++){
        int sum = 0;
        for(int j =0;j<M; j++){
            sum += arr[i][j];
        }
        cout << sum << endl;
    }
}

