#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);

/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */

long repeatedString(string s, long n) {
    if (s.length() >= n) {
        int ans = 0;
        for (size_t i = 0; i < n; i++) {
            if (s[i] == 'a')
                ans++;
        }
        return ans;
    }
    long long count = 0;
    for (auto c : s) {
        if (c == 'a') {
            count++;
        }
    }
    if (n % s.length() == 0)
        return count * (n / s.length());

    long long ans = count * (n / s.length());
    n %= s.length();
    for (size_t i = 0; i < n; i++) {
        if (s[i] == 'a')
            ans++;
    }
    return ans;
}

int main() {
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string n_temp;
    getline(cin, n_temp);

    long n = stol(ltrim(rtrim(n_temp)));

    long result = repeatedString(s, n);

    fout << result << "\n";

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace))));

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end());

    return s;
}

