#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> V(n);
    for (auto &e : V) {
        cin >> e;
    }

    sort(V.begin(), V.end(), greater<int>());

    int max = V[0];
    int i = 1;

    while (max == V[i])
        i++;

    cout << i;

    return 0;
}
