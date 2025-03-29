#include <bits/stdc++.h>
using namespace std;
 
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
 
    string in;
    cin >> in;
 
    string result;
    size_t i = 0;
    bool first_word = true;
 
    while (i < in.size()) {
        if (in.substr(i, 3) == "WUB") {
            i += 3;
        } else {
            if (!first_word) result += " ";
            while (i < in.size() && in.substr(i, 3) != "WUB") {
                result += in[i++];
            }
            first_word = false;
        }
    }
 
    cout << result << endl;
    return 0;
}