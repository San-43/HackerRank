#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    int h;
    cin >> n >> h;

    int i = 0;

    for (; i < h; ++i) {
        int x;
        cin >> x;
        n -= x;
        if (n <= 0) {
            cout << i + 1;
            return 0;
        }
    }
    cout << 0;
    return 0;
}
