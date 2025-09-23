#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int n , m;
	cin >> n >> m;
	int A[n],B[m];
	
	
	for(int i = 0; i < n; i++){
	    cin >> A[i];    
	}
	for(int i = 0; i < m; i++){
	    cin >> B[i];
	}
	
	for(int i = 0; i < m; i++){
	    int count = 0;
	    for(int j = 0; j < n; j++){
	        if(A[j]>B[i])  count++;
	    }
	    cout << count << " ";
	}
}
