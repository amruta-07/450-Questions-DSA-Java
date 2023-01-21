public class Longest_palindrome {
    public static void main(String[] args) {
        // aaaabbaa
        // 1 substring
        // 2 check palindrome
        // 3 max palindrome
        Longest_palindrome obj = new Longest_palindrome();
        String result = obj.longestPalindrome("abccaacc");

        System.out.println(result);

    }

    public String longestPalindrome(String s) {

        String maxpalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                // s.substring(i, j + 1);
                // System.out.println(s.substring(i, j + 1));
                if (checkPalindrome(s.substring(i, j + 1))) {
                    if (s.substring(i, j + 1).length() > maxpalindrome.length()) {
                        maxpalindrome = s.substring(i, j + 1);
                    }
                }

            }

        }
        return maxpalindrome;

    }

    public boolean checkPalindrome(String subStr) {
        String org_substr = subStr;
        String rev = "";
        for (int i = subStr.length() - 1; i >= 0; i--) {
            rev = rev + subStr.charAt(i);
        }
        if (org_substr.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }
}
