#include <bits/stdc++.h>
using namespace std;

class Dog {
    string color;
    int age, lifespan;

public:
    Dog(string c, int a, int l) {
        this->color = c;
        this->age = a;
        this->lifespan = l;
    }

    void display() {
        cout << "Color: " << color << endl;
        cout << "Age: " << age << endl;
        cout << "Lifespan: " << lifespan << endl;
    }
};

int main() {
    Dog d("Yellow", 5, 12);
    d.display();
    return 0;
}
