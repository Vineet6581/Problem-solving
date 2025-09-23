#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main() {
    vector<int> v;

    cout << v.size() << endl;
    cout << v.capacity() << endl;

    v.push_back(4);
    v.push_back(2);
    v.push_back(12);
    v.push_back(6);
    v.push_back(10);
    v.push_back(16);

    cout << endl << v.size() << endl;
    cout << v.capacity() << endl;

    for(int i = 0; i < v.size(); i++) {
        cout << v[i] << " ";
    }
    cout << endl;

    sort(v.begin(), v.end());
    cout << "After sorting (ascending): ";
    for(int i = 0; i < v.size(); i++) {
        cout << v[i] << " ";
    }
    cout << endl;

    reverse(v.begin(), v.end());
    cout << "After reversing (descending): ";
    for(int i = 0; i < v.size(); i++) {
        cout << v[i] << " ";
    }
    cout << endl;

    cout << "Using auto to print: ";
    for(auto val : v) {
        cout << val << " ";
    }
    cout << endl;

    v.pop_back();
    cout << "After pop_back(): ";
    for(auto val : v) {
        cout << val << " ";
    }
    cout << endl;

    return 0;
}
