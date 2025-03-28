#include <bits/stdc++.h>
using namespace std;

#define int long long

class DSU {
public:
    vector<int> parent, size;
    
    DSU(int n) {
        parent.resize(n + 1);
        size.resize(n + 1, 1);
        for (int i = 1; i <= n; ++i) {
            parent[i] = i;
        }
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    void unite(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        
        if (rootX != rootY) {
            if (size[rootX] < size[rootY]) {
                swap(rootX, rootY);
            }
            parent[rootY] = rootX;
            size[rootX] += size[rootY];
        }
    }
};

signed main() {
    int n, m;
    cin >> n >> m;
    
    DSU dsu(n);
    
    for (int i = 0; i < m; ++i) {
        int a, b;
        cin >> a >> b;
        dsu.unite(a, b);
    }
    
    vector<int> components;
    for (int i = 1; i <= n; ++i) {
        if (dsu.find(i) == i) {
            components.push_back(i);
        }
    }
    
    int k = components.size() - 1;
    cout << k << "\n";
    
    for (size_t i = 1; i < components.size(); ++i) {
        cout << components[0] << " " << components[i] << "\n";
    }
    
    return 0;
}
