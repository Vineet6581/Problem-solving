#include <bits/stdc++.h>
using namespace std;
int main(){
    cout  << "enter the number of arrays: ";
    int n;
    //m = 3;
    cin >> n;
    int arr[3];
        for(int k = 0; k <n;k++){
        for(int i = 0; i<n; i++){
        cin >> arr[i];
        }
        int max = INT_MIN;
        for(int j = 0; j < n; j++){
            if(max < arr[j]){
                max = arr[j];
            }
        }
        cout << max;
    }
}
