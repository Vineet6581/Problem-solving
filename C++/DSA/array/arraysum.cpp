#include <bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0; i<n; i++){
        cin >> arr[i];
    }
    int sum1,sum2;
    sum1 = arr[0]+arr[1];
    sum2 = arr[n-2]+arr[n-1];
    cout << sum1 << " " << sum2;
}