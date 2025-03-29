#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int n;
	cin >> n;

	vector<int> coins(n);
	int total_sum = 0;

	for (int i = 0; i < n; i++) {
		cin >> coins[i];
		total_sum += coins[i];
	}

	sort(coins.rbegin(), coins.rend());

	int taken_sum = 0, count = 0;
	for (int i = 0; i < n; i++) {
		taken_sum += coins[i];
		count++;
		if (taken_sum > total_sum / 2) {
			cout << count << '\n';
			return 0;
		}
	}

	return 0;
}
