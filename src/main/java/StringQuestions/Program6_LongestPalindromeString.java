package StringQuestions;

public class Program6_LongestPalindromeString {
    /*
    Longest Palindrome in a String
    Example 1:

    Input:
    S = "aaaabbaa"
    Output: aabbaa
    Explanation: The longest Palindromic
    substring is "aabbaa".

     */

    static  int resultStart;
    static int resultLength;

    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(longestPalindrome(s));

    }

    private static String longestPalindrome(String s) {
        for(int start = 0; start <s.length();start++){
            //in odd string length case
            expandRange(s, start, start);

            //in even string length case
            expandRange(s, start, start+1);

        }

        return s.substring(resultStart, resultStart + resultLength);
    }

    private static void expandRange(String s, int begin, int end) {
        while (begin>=0 && end<s.length() && s.charAt(begin) ==s.charAt(end)){
            begin --;
            end ++;
        }

        if(resultLength < end -begin-1){
            resultStart =begin +1;
            resultLength = end-begin-1;
        }

    }
}
