#include <iostream>

using namespace std;

int main() {
    string s;
    cin >> s;
    int t = 0;
    int count = 0;
    for (auto e : s) {
        if (e == 'A' || e == 'C' || e == 'G' || e == 'T')
            count++;
        if (count == 3) {
            t++;
            count = 0;
        }
    }

    cout << t << " ";
    count == 0 ? cout << 0 : cout << (3 - count);
    return 0;
}
