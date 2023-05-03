#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    int i = 1, j = 2, suma = 3, formas = 1, count = 2;
    vector<vector<int>> secuencias;

    int limite = (n % 2 == 0) ? n / 2 : (n + 1) / 2;
    while (i <= limite) {
        if (suma == n) {
            formas++;
            vector<int> secuencia;
            for (int k = i; k <= j; k++) {
                secuencia.push_back(k);
            }
            secuencias.push_back(secuencia);
            i++;
            count++;
            j = count;
            suma = i + j;
        }
        if (suma < n) {
            j++;
            suma += j;
        }
        if (suma > n) {
            i++;
            count++;
            j = count;
            suma = i + j;
        }
    }

    cout << formas << endl;
    for (vector<int> secuencia : secuencias) {
        for (int k = 0; k < secuencia.size(); k++) {
            cout << secuencia[k];
            if (k < secuencia.size() - 1) {
                cout << "+";
            }
        }
        cout << "=" << n << endl;
    }

    cout << n << "=" << n;

    return 0;
}
