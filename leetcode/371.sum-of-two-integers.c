int getSum(int a, int b) {
    while (b != 0) {
        unsigned int carry = ((unsigned int)a & (unsigned int)b) << 1; // Treat as unsigned for the carry
        a = a ^ b;  // Sum without carry
        b = carry;  // Assign carry to b for the next iteration
    }
    return a;
}
