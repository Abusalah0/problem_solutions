int minFlips(int a, int b, int c) {
    int flips = 0;
    int target = a | b;
    int diff = target ^ c;

    while (diff > 0) {
        if (diff & 1) {
            if ((c & 1) == 0) {
                flips += (a & 1) + (b & 1);
            } else {
                flips += 1;
            }
        }
        a >>= 1;
        b >>= 1;
        c >>= 1;
        diff >>= 1;
    }

    return flips;
}
