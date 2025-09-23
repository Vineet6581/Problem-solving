#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    sort(arr, arr + n);

    for (int i = 0; i < min(5, n); i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    int sum_top_5 = accumulate(arr + max(0, n - 5), arr + n, 0);
    cout << sum_top_5 << endl;

    return 0;
}
