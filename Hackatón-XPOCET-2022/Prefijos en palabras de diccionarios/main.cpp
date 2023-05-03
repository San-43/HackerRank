#include <bits/stdc++.h>

using namespace std;
unordered_map<string,int> d;

int main() {
    std::cin.tie(0);
    std::ios_base::sync_with_stdio(0);
    int n;
    int m;
    cin>>n;

    string cadena;
    string subcadena;
    for(int i=0; i<n; i++){
        cin>>cadena;
        subcadena="";
        for(int j=0; j<cadena.length(); j++){
            subcadena+=cadena[j];
            d[subcadena]++;
        }
    }
    cin>>m;
    string prefijo;
    for(int i=0; i<m; i++){
        cin>>prefijo;
        cout<<d[prefijo]<<" ";
    }
    return 0;
}