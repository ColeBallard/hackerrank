#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    // Complete the code.
    int a, b;
    cin >> a >> b;
    string nums[9] = {"one", "two", "three", "four", "five", "six", "seven", "eight","nine"};
    for (; a <= b; a++) {
        if (a > 9) {
            if (a % 2 == 0)
                cout << "even" << endl;
            else 
                cout << "odd" << endl;
        }
        else 
            cout << nums[a - 1] << endl;
    }
    return 0;
}
