#include <bits/stdc++.h>
using namespace std;
int main(){
    int N;
    cin >> N;
    
    for(int i = 0; i < N ; i++){
        int M;
        cin >> M;
        int arr[M];
        for(int j = 0; j < M; j++){
            cin >> arr[j];
        }
        int sum = accumulate(arr,arr+M,0);
        cout << *max_element(arr,arr+M) <<" " << *min_element(arr,arr+M) << " "<< sum << " " <<fixed<<setprecision(1)<< (float)sum/M<<endl;
    }
}
