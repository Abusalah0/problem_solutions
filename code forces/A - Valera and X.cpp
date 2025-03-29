#include <iostream>
using namespace std;
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
 
    int n;
    cin >> n;
    string in[n];
 
    for (int i = 0; i < n; i++) {
        cin >> in[i];
    }
 
    char x = in[0][0];
    char filler = in[0][1];
    if (x == filler) {
        cout << "NO" << endl;
        return 0;
    }
 
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j || i + j == n - 1) {
                if (in[i][j] != x) {
                    cout << "NO" << endl;
                    return 0;
                }
            } else {
                if (in[i][j] != filler) {
                    cout << "NO" << endl;
                    return 0;
                }
            }
        }
    }
    cout << "YES" << endl;
    return 0;
}