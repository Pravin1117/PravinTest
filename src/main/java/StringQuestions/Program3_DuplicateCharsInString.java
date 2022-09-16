package StringQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program3_DuplicateCharsInString {
    /*
    Print all the duplicates in the input string
     */
    public static void main(String[] args) {
        String input = "geeksforgeeks";
        duplicateCharCheck(input);

    }

    private static void duplicateCharCheck(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i =0; i<input.length();i++){
            if (!map.containsKey(input.charAt(i))){
                map.put(input.charAt(i),1);
            }else{
                map.put(input.charAt(i),map.get(input.charAt(i))+ 1);
            }
        }

        for (Map.Entry<Character, Integer> entry :map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if(value>1){
                System.out.println(key + ", count = " + value);
            }

        }
    }
}
