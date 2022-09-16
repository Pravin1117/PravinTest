package StringQuestions;

public class Program2_PalindromeString {
    /*
    Given a string S, check if it is palindrome or not.

    Example 1:

    Input: S = "abba"
    Output: 1
    Explanation: S is a palindrome
     */

    public static void main(String[] args) {
        String input = "acca";
        System.out.println(palindromeCheck(input));

    }

    private static boolean palindromeCheck(String input) {
        boolean flag= false;
        String rev = "";
        for (int i =input.length()-1;i>=0;i--){
            rev = rev+input.charAt(i);
        }

        if(rev.equals(input)){
            flag = true;
        }
        return flag;
    }
}
