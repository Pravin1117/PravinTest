package ArraysQuestions;

import java.util.HashSet;
import java.util.Set;

public class Program6_UnionAndIntersectionOfArrays {
    /*
    Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.
    Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
    If there are repetitions, then only one occurrence of element should be printed in the union.
    Example 1:

    Input:
    5 3
    1 2 3 4 5
    1 2 3
    Output:
    5
    Explanation:
    1, 2, 3, 4 and 5 are the
    elements which comes in the union set
    of both arrays. So count is 5.
     */

    public static void main(String[] args) {
        int []num1 = {1,2,3,4,5};
        int []num2 = {1,2,3};

        System.out.println(unionOfArrays(num1,num2));
    }

    private static int unionOfArrays(int[] num1, int[] num2) {
        int unionCount = 0;
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<num1.length;i++){
           set.add(num1[i]);
        }

        for(int i =0; i<num2.length;i++){
            set.add(num2[i]);
        }
        unionCount = set.size();
        return unionCount;
    }
}
