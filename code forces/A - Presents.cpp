#include <iostream>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int n;
	cin >> n;
	int arr[n];
	int output[n] = {0};

	for (int i = 0; i < n; i++) {
		cin >> arr[i];
		output[arr[i] - 1] = i + 1;
	}

	for (int i = 0; i < n; i++) {
		cout << output[i] << " ";
	}
	cout << endl;
	return 0;
}
