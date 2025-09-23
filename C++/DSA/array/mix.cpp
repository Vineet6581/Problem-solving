#include <bits/stdc++.h>
using namespace std;
int main(){
    int N;
    cin >> N;
    for(int i = 0; i < N ; i++){
        int n;
        cin >> n;
        string type;
        cin >> type;
            if(type == "INT"){
                int arr[n];
                for(int i = 0; i <n; i++){
                    cin >> arr[i] ;
                }
                
                cout << accumulate(arr,arr+n,0);
            } else if (type == "STRING"){
                
                string arr[n];
                for(int i = 0; i <n; i++){
                    cin >> arr[i] ;
                }
                
                string lw = "";
                for(int j = 0; j < n; j++){
                    if(arr[j].length() > lw.length()){
                        lw = arr[j];
                    }
                }
                cout << endl << lw << endl;
            }
    }
}
