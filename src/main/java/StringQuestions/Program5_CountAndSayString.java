package StringQuestions;

public class Program5_CountAndSayString {
    /*
    https://leetcode.com/problems/count-and-say/

    Example 2:

    Input: n = 4
    Output: "1211"
    Explanation:
    countAndSay(1) = "1"
    countAndSay(2) = say "1" = one 1 = "11"
    countAndSay(3) = say "11" = two 1's = "21"
    countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
    countAndSay(5) = say "1211" = one 1 +one 2+ two 1 = "111221"
     */

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countAndSay(n));
    }

    private static String countAndSay(int n) {
        if(n==1) return "1";
//         Recursion
        String s=countAndSay(n-1);
        StringBuilder res = new StringBuilder();
        // String res="";
        int counter=0;

        for(int i=0;i<s.length();i++)
        {
            counter++;
//             Segregating into groups
            if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1))
            {
                res.append(counter).append(s.charAt(i));
                // res=res+counter+s.charAt(i);
                counter=0;
            }
        }
        return res.toString();

    }

}
