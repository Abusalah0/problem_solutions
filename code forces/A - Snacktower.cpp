#include <iostream>
#include <vector>
using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int n;
	cin >> n;
	vector<bool> present(n + 1, false);
	int expected = n;

	for (int i = 0; i < n; i++) {
		int snack;
		cin >> snack;
		present[snack] = true;

		while (expected > 0 && present[expected]) {
			cout << expected-- << " ";
		}
		cout << '\n';
	}

	return 0;
}
