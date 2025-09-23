#include<bits/stdc++.h>
using namespace std;
int main(){
    int N;
    cin>>N;
    vector<int> arr(N);
    for(int i = 0; i < N; i++){
        cin >> arr[i];
    }
    int maxval = *max_element(arr.begin(),arr.end());
    cout<< maxval<<endl;
    int minval = *min_element(arr.begin(),arr.end());
    cout << minval << endl;
    int maxi,mini;
    for(int i = 0; i <  N; i++){
        if(maxval == arr[i]){
            maxi=i;
        }
        if(minval == arr[i]){
            mini = i;
        }
    }
    cout << maxi << endl;
    cout<<mini<<endl;
    if(maxi > mini){
        for(int i = mini; i < maxi; i++){
            cout << arr[i];
        }
        for(int i = 0; i < mini ; i++){
            cout << arr[i];
        }
        for(int i = maxi; i < N; i++){
            cout << arr[i];
        }
    } else{
        for(int i = maxi; i < mini; i++){
            cout << arr[i];
        }
        for(int i = 0; i < maxi ; i++){
            cout << arr[i];
        }
        for(int i = mini; i < N; i++){
            cout << arr[i];
        }
    }
    return 0;
}