#include<bits/stdc++.h>
using namespace std;
int main(){
    int N;
    cin>>N;
    int arr[N];
    int k;
    cin >> k;
    for(int i = 0; i < N; i++){
        cin >> arr[i];
    }
    for(int i = 0; i<N; i += 2*k){
        for(int j = 0; j < k; j++){
            int temp = arr[i+j];
            arr[i+j]= arr[i+j+k];
            arr[i+j+k]=temp;
        }
    }
    for(int i = 0; i < N; i++){
        cout << arr[i]<<" ";
    }
    return 0;
}
