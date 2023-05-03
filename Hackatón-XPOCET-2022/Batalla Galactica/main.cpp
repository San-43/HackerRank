#include <bits/stdc++.h>

using namespace std;

struct ship {
    string name;
    int x;
    int y;
    int z;
    double dist;
};

double dist(int x, int y, int z) {
    return sqrt(pow((0 - x), 2) + pow((0 - y), 2) + pow((0 - z), 2));
}

int main() {
    int n;
    cin >> n;
    vector<ship> V(n);
    for (auto &e: V) {
        cin >> e.name >> e.x >> e.y >> e.z;
        e.dist = dist(e.x, e.y, e.z);
    }

    ship const *aux = &V[0];

    for (int i = 1; i < n; ++i) {
        if (aux->dist > V[i].dist) {
            aux = &V[i];
        }
    }

    cout << aux->name;
    cout << "\n**********\n";
    for (auto const &e: V) {
        if (e.name != aux->name)
            cout << e.name << " " << e.x << " " << e.y << " " << e.z << '\n';
    }
    return 0;
}
