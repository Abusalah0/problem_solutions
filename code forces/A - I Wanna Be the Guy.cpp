#include <iostream>
#include <set>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int levels;
	cin >> levels;

	set<int> numbers;

	int p, q, num;
	cin >> p;
	for (int i = 0; i < p; i++) {
		cin >> num;
		numbers.insert(num);
	}

	cin >> q;
	for (int i = 0; i < q; i++) {
		cin >> num;
		numbers.insert(num);
	}

	if (numbers.size() == levels) {
		cout << "I become the guy." << endl;
	} else {
		cout << "Oh, my keyboard!" << endl;
	}

	return 0;
}
