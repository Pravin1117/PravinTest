package StringQuestions;

public class Program9_CountNumberOfChars {
    /*Program to count occurrence of a given character in a string
    Examples:
    Input : str = "geeksforgeeks"
             c = 'e'
    Output : 4
    'e' appears four times in str.

    Input : str = "abccdefgaa"
              c = 'a'
    Output : 3
    'a' appears three times in str.

    Input : str ="TestGit"
    
     */

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char c = 'e';

        System.out.println(countOccurrence(str, c));

    }

    private static int countOccurrence(String str, char c) {
        int count = 0;

        for (int i =0; i<str.length();i++){
            if(str.charAt(i) ==c){
                count++;
            }
        }

        return count;
    }
}
