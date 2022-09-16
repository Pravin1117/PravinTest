package StringQuestions;

import java.util.Arrays;

public class Program1_ReverseAString {
    /*
    Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
     */

    public static void main(String[] args) {
        
        String s = "welcome";
        System.out.println(reverseInput(s));

        String s1 = "welcome to java";
        System.out.println(reverseSentence(s1));

        System.out.println(reverseWordsinSentence(s1));

        char[] s2 = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(reverseACharacterArray(s2))) ;
        

    }

    private static char[] reverseACharacterArray(char[] s2) {
        int start = 0, end = s2.length-1;

        while (start<end){
            char temp = s2[start];
            s2[start]=s2[end];
            s2[end] = temp;

            start++;
            end--;
        }
        return s2;
    }

    private static String reverseWordsinSentence(String s1) {
        String []words = s1.split(" ");
        String rev = " ";
        for (int i =words.length-1; i>=0;i--){
            rev = rev + words[i] + " ";
        }

        return rev;
    }

    private static String reverseSentence(String s1) {
        String [] word = s1.split(" ");
        String rev = " ";
        for (int i = s1.length()-1;i>=0;i--){
            rev = rev + s1.charAt(i);
        }
        return rev;
    }

    private static String reverseInput(String  s) {
        String rev= "";
        for (int i= s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}
