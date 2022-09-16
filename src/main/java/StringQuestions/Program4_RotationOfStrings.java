package StringQuestions;

public class Program4_RotationOfStrings {
    /*
    A Program to check if strings are rotations of each other or not
    Given a string s1 and a string s2, write a snippet to say whether s2 is a rotation of s1?
    (eg given s1 = ABCD and s2 = CDAB, return true, given s1 = ABCD, and s2 = ACBD , return false)

    Algorithm: areRotations(str1, str2)
     */

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";

        System.out.println(rotationValidation(str1,str2));
    }

    private static boolean rotationValidation(String str1, String str2) {
        System.out.println((str1 + str1).indexOf(str2));

        return (str1.length() == str2.length()) &&
                ((str1 + str1).indexOf(str2) != -1);

        //abcdabcd
    }
}
