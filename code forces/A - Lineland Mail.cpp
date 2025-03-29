#include <iostream>
#include <vector>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int n;
	cin >> n;

	vector<int> cities(n);
	for (int i = 0; i < n; i++) {
		cin >> cities[i];
	}

	cout << abs(cities[0] - cities[1]) << " ";
	cout << abs(cities[n - 1] - cities[0]) << endl;
	for (int i = 1; i < n - 1; i++) {
		cout << min(abs(cities[i - 1] - cities [i]), abs(cities[i] - cities[i + 1])) << " ";
		cout << max(abs(cities[0] - cities [i]), abs(cities[i] - cities[n - 1])) << endl;
	}
	cout << abs(cities[n - 1] - cities[n - 2]) << " ";
	cout << abs(cities[n - 1] - cities[0]) << endl;
	return 0;
}
