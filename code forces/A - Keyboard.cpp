#include <iostream>

using namespace std;

int main() {
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	char dir;
	cin >> dir;
	string in;
	cin >> in;
	string s = "qwertyuiopasdfghjkl;zxcvbnm,./";

	for (char c : in) {
		int pos = s.find(c);
		cout << s[pos + (dir == 'L' ? 1 : -1)];
	}

	cout << '\n';
	return 0;
}
