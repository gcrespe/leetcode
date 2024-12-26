int compareVersions(char *version1, char *version2){
    int i, j, v1, v2, len1, len2;
    i = j = v1 = v2 = 0;
    len1 = strlen(version1);
    len2 = strlen(version2);

    while (i < len1 || j < len2) {
        while (i < len1 && version1[i] != '.') {
            v1 = v1 * 10 + (version1[i] - '0');
            i++;
        }
        while (j < len2 && version2[j] != '.') {
            v2 = v2 * 10 + (version2[j] - '0');
            j++;
        }
        if (v1 > v2) return 1;
        else if (v1 < v2) return -1;
        else {
            v1 = v2 = 0;
            i++;
            j++;
        }
    }
    return 0;
}