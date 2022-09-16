package StringQuestions;

public class Program7_PrintAllSubstrings {
    /*
    Print all subsequences of a string
    Examples:

    Input : abc
    Output : a, b, c, ab, bc, ac, abc

    Input : aaa
    Output : a, a, a, aa, aa, aa, aaa
     */

    public static void main(String[] args) {
        String input = "abc";

        returnAllSubStrings(input);
        System.out.println("=================================================");
        String input1 = "forgeeksskeegfor";
        returnAllSubStrings(input1);


    }

    private static void returnAllSubStrings(String input) {
        for (int i=0; i<input.length();i++){
            for (int j =i+1;j<=input.length();j++){
                System.out.println(input.substring(i,j));
            }
        }

    }
}
