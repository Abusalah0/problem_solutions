bool isSubsequence(char* s, char* t) {
    if (!s || !t)
        return false;
    
    int i = 0;
    int j = 0;

    while (s[j])
    {
        if (t[i] == '\0')
            return false;
        if (s[j] == t[i])
            j++;
        i++;
    }
    return true;
}