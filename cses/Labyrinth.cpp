#include <bits/stdc++.h>
using namespace std;
 
#define int long long
 
int dx[] = {-1, 0, 1, 0};
int dy[] = {0, 1, 0, -1};
 
string dir = "URDL";
 
signed main()
{
    int n , m ;
    cin >> n >> m;
    vector<vector<char>> grid(n, vector<char>(m));
    vector<vector<bool>> vis(n, vector<bool>(m, false));
    vector<vector<int>> path(n, vector<int>(m));
    pair<int,int> A,B;
 
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < m; ++j) {
            cin >> grid[i][j];
            if (grid[i][j] == 'A')
                A = {i, j};
            else if (grid[i][j] == 'B')
                B = {i, j};
            else if (grid[i][j] == '#')
                vis[i][j] = true;
 
        }
    }
 
    auto isValid = [&](int i, int j) -> bool {
        return !(i < 0 || j < 0 || j >= m || i >= n || vis[i][j]);
    };
 
 
    queue<pair<int, int>> q;
    q.emplace(A);
    vis[A.first][A.second] = true;
    while (!q.empty())
    {
        pair<int, int> n = q.front();
        q.pop();
        for (int i = 0; i < 4; ++i) {
            int u = n.first + dx[i], v = n.second + dy[i];
            if (isValid(u,v)) {
                vis[u][v] = true;
                path[u][v] = i;
                q.emplace(u, v);
            }
        }
    }
 
    if (vis[B.first][B.second])
    {
        cout << "YES\n";
        string ans;
        while (B != A)
        {
            int p = path[B.first][B.second];
            ans += dir[p];
            B = {B.first - dx[p], B.second - dy[p]};
 
        }
        reverse(ans.begin(), ans.end());
 
        cout << ans.size() << '\n' << ans << '\n';
    }
    else
    {
        cout << "NO\n";
    }
 
    return 0;
 
}
