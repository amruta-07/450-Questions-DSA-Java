Count and say

The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a contiguous section all of the same character. Then for each group, say the number of characters, then say the character. To convert the saying into a digit string, replace the counts with a number and concatenate every saying.

For example, the saying and conversion for digit string "3322251":




class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

		// You need to say the output of (n-1), so this is the input for which we count the digits and return as ouput for n
        String input = countAndSay(n-1);
		
        StringBuilder builder = new StringBuilder();
        char lastChar = input.charAt(0);
        int count = 1;
        for (int i = 1; i < input.length(); ++i) {
            char c = input.charAt(i);
            if (c == lastChar) {
                ++count;
            } else {
                builder.append(count);
                builder.append(lastChar);
                lastChar = c;
                count = 1;
            }
        }
        builder.append(count);
        builder.append(lastChar);

        return builder.toString();
    }
}