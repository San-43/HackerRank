#include <bits/stdc++.h>

using namespace std;

int costoLetra(char c) {
    if (c == 'Q' || c == 'A' || c == 'Z')
        return 1;
    else if (c == 'W' || c == 'S' || c == 'X')
        return 2;
    else if (c == 'E' || c == 'D' || c == 'C')
        return 3;
    else if (c == 'R' || c == 'F' || c == 'V')
        return 4;
    else if (c == 'T' || c == 'G' || c == 'B')
        return 5;
    else if (c == 'Y' || c == 'H' || c == 'N')
        return 6;
    else if (c == 'U' || c == 'J' || c == 'M')
        return 7;
    else if (c == 'I' || c == 'K')
        return 8;
    else if (c == 'O' || c == 'L')
        return 9;
    else
        return 0;
}

int main() {
    string s;
    cin >> s;

    int sum = 0;
    for (auto e: s) {
        sum += costoLetra(e);
    }
    cout << sum;
    return 0;
}
