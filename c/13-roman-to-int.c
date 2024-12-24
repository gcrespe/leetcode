#include <stdio.h>
#include <string.h>

int romanToInt(char *s) {
    int len = strlen(s);
    int ans = 0;
    int i = 0;
    while (i < len) {
        switch (s[i]) {
        case 'M':
            ans += 1000;
            break;
        case 'D':
            ans += 500;
            break;
        case 'C':
            if (s[i + 1] == 'D' || s[i + 1] == 'M'){
                ans -= 100;
            }
            else {
                ans += 100;
            }
            break;
        case 'L':
            ans += 50;
            break;
        case 'X':
            if (s[i + 1] == 'L' || s[i + 1] == 'C'){
                ans -= 10;
            }
            else {
                ans += 10;
            }
            break;
        case 'V':
            ans += 5;
            break;
        case 'I':
            if (s[i + 1] == 'V' || s[i + 1] == 'X'){
                ans -= 1;
            }
            else {
                ans += 1;
            }
            break;
        default:
            break;
        }
        i++;
    }
    return ans;
}