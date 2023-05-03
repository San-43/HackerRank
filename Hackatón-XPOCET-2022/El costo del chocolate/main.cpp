#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    int m;
    cin >> n >> m;
    int sum1 = 0;
    for (int i = 0; i < n - 1; ++i) {
        int x;
        cin >> x;
        sum1 += x;
    }

    int sum2 = 0;
    for (int i = 0; i < m - 1; ++i) {
        int y;
        cin >> y;
        sum2 += y;
    }

    cout << (sum2 + m*sum1);
    return 0;
}
