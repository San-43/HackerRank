#include <bits/stdc++.h>

using namespace std;

/*
 * Complete the 'makeAnagram' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. STRING a
 *  2. STRING b
 */

int makeAnagram(string a, string b) {
    vector<int> v(26, 0);
    vector<int> v2(26, 0);
    for(auto c : a)
        v[c - 'a']++;
    for(auto c : b)
        v2[c - 'a']++;

    int ans = 0;
    for(int i = 0; i < 26; i++) {
        ans += abs(v[i] - v2[i]);
    }
    return ans;
}

int main() {
    ofstream fout(getenv("OUTPUT_PATH"));

    string a;
    getline(cin, a);

    string b;
    getline(cin, b);

    int res = makeAnagram(a, b);

    fout << res << "\n";

    fout.close();

    return 0;
}
