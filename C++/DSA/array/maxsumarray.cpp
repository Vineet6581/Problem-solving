#include <bits/stdc++.h>
using namespace std;
int main() {
	// your code goes here
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0 ; i < n; i++){
        cin >> arr[i];
    }
    int csum = arr[0];
    int ans = 0;
    for(int i = 0; i < n; i++){
        int sum = 0;
        for(int j =i;j<n;j++){
            sum += arr[j];
            ans = max(ans,sum);
        }
    }
    cout << ans <<endl;
}



