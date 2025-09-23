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
    for(auto row:arr){
        int sum =    accumulate(row.begin(), row.end(), 0);
        int maxval = *max_element(row.begin(),row.end());
        int minval = *min_element(row.begin(),row.end());
        cout << sum << " " << maxval << " " << minval<< endl;
    }
}
