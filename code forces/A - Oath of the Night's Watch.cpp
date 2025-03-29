#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int n;
	cin >> n;

	vector<int> strengths(n);
	for (int i = 0; i < n; i++) {
		cin >> strengths[i];
	}

	int min_strength = *min_element(strengths.begin(), strengths.end());
	int max_strength = *max_element(strengths.begin(), strengths.end());

	int min_count = count(strengths.begin(), strengths.end(), min_strength);
	int max_count = count(strengths.begin(), strengths.end(), max_strength);

	int result = n - min_count - max_count;
	cout << (result > 0 ? result : 0) << '\n';

	return 0;
}
