package StringQuestions;

public class Program8_PrintAllSubsequences {
    /*
    *
    Print all subsequences of a string
    Examples:

    Input : abc
    Output : a, b, c, ab, bc, ac, abc
     */

    public static void main(String[] args) {
        //Using recursion logic.
        String input = "abc";
        int index =0;
        subSequences(input, "", index);
        
    }

    private static void subSequences(String input, String output, int index) {
        //base case
        if(index>=input.length()){
            for(int i =0; i<output.length();i++){
                System.out.print(output.charAt(i));
            }
            System.out.println();
            return;
        }

        //include element
        output = output + input.charAt(index);
        subSequences(input,output,index+1);

        //exclude element
        output = output.substring(0,output.length()-1);
        subSequences(input,output,index+1);




    }
}
