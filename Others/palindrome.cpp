#include <iostream>

class Solution {
public:
    bool isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = (reversedHalf * 10) + (x % 10);
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
};

int main() {
    Solution solution;

    int testCases[] = {121, -121, 10, 0, 1221, 12321, 123456};

    for (int x : testCases) {
        bool result = solution.isPalindrome(x);
        std::cout << "Input: x = " << x 
                  << " | Is Palindrome: " << (result ? "true" : "false") 
                  << std::endl;
    }

    return 0;
}