#include <bits/stdc++.h>

using namespace std;

int main() {
    string s;
    cin >> s;
    if (int x = stoi(s); x > 1001 && x % 10 != 0) {
        for (int i = 0; i < s.length() / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length() - i - 1];
            s[s.length() - i - 1] = temp;
        }
        cout << s;
    } else
        cout << "NA";
    return 0;
}
