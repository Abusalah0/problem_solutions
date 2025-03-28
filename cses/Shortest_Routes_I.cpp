#include <bits/stdc++.h>
using namespace std;
#define int long long
vector <vector<pair<int, int>>> graph;
vector <int> cost;
signed main() {
    cin.tie(nullptr);
    ios_base::sync_with_stdio(false);
 
    int n, m;
    cin >> n >> m;
    graph.assign( n + 1, {});
    cost.assign(n + 1, INT64_MAX);
 
    for (int i = 1, a, b, c; i <= m; ++i) {
        cin >> a >> b >> c;
        graph[a].push_back({b, c});
    }
 
 
    priority_queue<pair<int, int>> q; // cost , node
    cost[1] = 0;
    q.push({0, 1});
    while ((int)q.size())
    {
        int u = q.top().second, cst = -q.top().first;
        q.pop();
        if (cost[u] < cst)
            continue;
        for (int i = 0; i < (int)graph[u].size(); i+=1)
        {
            int v = graph[u][i].first, c = graph[u][i].second;
            if ( c + cst < cost[v])
            {
                cost[v] = c + cst;
                q.push({-cost[v], v});
            }
        }
    }
 
    for (int i = 1; i <= n; ++i)
        cout << cost[i] << ' ';
 
 
    return 0;
}