#include <iostream>
#include <unordered_map>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int n;
	cin >> n;
	unordered_map<string, int> map;
	string team, max_team;
	int max_count = 0;

	for (int i = 0; i < n; i++) {
		cin >> team;
		map[team]++;

		if (map[team] > max_count) {
			max_count = map[team];
			max_team = team;
		}
	}

	cout << max_team << endl;
	return 0;
}
